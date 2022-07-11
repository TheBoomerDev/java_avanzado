package ejercicios.ej02.models;

import ejercicios.ej01.interfaces.CuentaBanco;
import ejercicios.ej01.interfaces.LlegadaLimite;
import ejercicios.ej02.common.Tools;
import ejercicios.ej02.interfaces.ObservadorCuenta;

public class CuentaBitcoin extends AbsCuentaBanco{
	
	private float saldo = 0f;
	private ObservadorCuenta listener;
	
	public CuentaBitcoin(ObservadorCuenta listener) throws Exception {
		this.numeroCuenta = Tools.getRandomHexString(16);
		if (listener == null) {
			throw new Exception("Necesitamos el Limite");
		} 
		this.listener = listener; 
	}

	@Override
	public void meter(int cantidad) {
		this.saldo = this.saldo + cantidad; 
	}

	@Override
	public boolean sacar(int cantidad) {
		
		if ((cantidad <= 0) || (this.saldo <= 0) || (this.saldo < cantidad) ) {
			return false;
		} 
		
		float amount = ((float)cantidad)/100f;
		this.saldo = this.saldo - amount;
		return true;
	}

	@Override
	public int mostrarSaldo() {
		float valor = this.saldo * 100f;
		return (Integer.valueOf(String.valueOf(valor)));
	}

}
