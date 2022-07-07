package ejercicios.ej01.tiposCuenta;

import ejercicios.ej01.interfaces.CuentaBanco;

public class CuentaDebito extends CuentaBanco{
 
	private int saldo = 0;
	
	public CuentaDebito(int numeroCuenta) {
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
