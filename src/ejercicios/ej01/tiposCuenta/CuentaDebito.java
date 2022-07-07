package ejercicios.ej01.tiposCuenta;

import ejercicios.ej01.interfaces.CuentaBanco;
import ejercicios.ej01.interfaces.LlegadaLimite;

public class CuentaDebito extends CuentaBanco{
 
	private int saldo = 0;
	private LlegadaLimite listener;
	
	public CuentaDebito(int numeroCuenta, LlegadaLimite listener) throws Exception {
		if (listener == null) {
			throw new Exception("Necesitamos el Limite");
		}
		this.listener = listener;
		this.numeroCuenta = numeroCuenta;
		
	} 
 
	public void meter( int cantidad) {
		this.saldo = this.saldo + cantidad; 
	} 
 
	public boolean sacar(int cantidad) {
		if ((cantidad <= 0) || (this.saldo <= 0) || (this.saldo < cantidad) ) {
			return false;
		} 
		
		this.saldo = this.saldo - cantidad;
		return true;
	} 
 
	public int mostrarSaldo() {
		return this.saldo;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	} 
	
}
