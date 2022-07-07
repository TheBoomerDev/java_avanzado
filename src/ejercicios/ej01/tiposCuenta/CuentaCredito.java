package ejercicios.ej01.tiposCuenta;

import ejercicios.ej01.interfaces.CuentaBanco;
import ejercicios.ej01.interfaces.LlegadaLimite;

public class CuentaCredito extends CuentaBanco{
	
	private final int numeroCuenta;
	private LlegadaLimite listener;
	private int saldo = 0;
	private int limite = 0;	
	
	public CuentaCredito(int numeroCuenta, int limite, LlegadaLimite listener) throws Exception {
		if (listener == null) {
			throw new Exception("Necesitamos el Limite");
		}
		this.limite = limite;
		this.listener = listener;
		this.numeroCuenta = numeroCuenta;
	}
	
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	
	@Override
	public String toString() {
		String formato = "%d -> Saldo: %d";
		return String.format(formato, this.numeroCuenta, this.mostrarSaldo());
	}
	
	@Override
	public void meter(int cantidad) {
		this.saldo = this.saldo + cantidad;
	}

	@Override
	public boolean sacar(int cantidad) {
		if (cantidad <= 0) {
			return true;
		}
		
		// Podemos sacar del Saldo
		if (this.saldo >= cantidad) {
			//this.saldo -= cantidad;
			this.saldo = this.saldo - cantidad;
			return true;
		}
		
		
		if ((this.limite + this.saldo) > cantidad) {
			// Usamos saldo + Limite
			if (this.saldo > 0) {
				int aux = cantidad - this.saldo;
				this.saldo = this.saldo - cantidad;
				this.limite = this.limite - aux;
			}else {
				// Usamos solo el Limite
				this.limite = this.limite - cantidad;
			} 
			
			if (this.limite <= 0) {
				if (listener != null) listener.limiteSobrepasado(this);
			}
			
			return true;
		} 
		
		// No nos llega el saldo y el limite
		return false;
	}

	@Override
	public int mostrarSaldo() {
		return this.saldo + this.limite;
	}

}
