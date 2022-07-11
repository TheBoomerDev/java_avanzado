package ejercicios.ej02.models;

import ejercicios.ej01.interfaces.CuentaBanco;
import ejercicios.ej01.interfaces.LlegadaLimite;
import ejercicios.ej02.interfaces.ObservadorCuenta;

public class CuentaDebito extends AbsCuentaBanco{
 
	private int saldo = 0;
	private ObservadorCuenta listener;
	
	public CuentaDebito(String numeroCuenta, ObservadorCuenta listener) throws Exception {
		if (listener == null) {
			throw new Exception("Necesitamos el Limite");
		}
		if (numeroCuenta.length() != 16) {
			throw new Exception("Numero Cuenta No Valido");
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
	
	
}
