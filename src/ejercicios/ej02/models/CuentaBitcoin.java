package ejercicios.ej02.models;

import java.util.List;

import ejercicios.ej01.interfaces.CuentaBanco;
import ejercicios.ej01.interfaces.LlegadaLimite;
import ejercicios.ej02.common.Tools;
import ejercicios.ej02.interfaces.ObservadorCuenta;

public class CuentaBitcoin extends AbsCuentaBanco{
	
	private float saldo = 0f;
	private List<ObservadorCuenta> listeners = new ArrayList<ObservadorCuenta>();
	
	public CuentaBitcoin(ObservadorCuenta listener) throws Exception {
		this.numeroCuenta = Tools.getRandomHexString(16);
		if (listener == null) {
			throw new Exception("Necesitamos el Limite");
		} 
		this.listeners.add(listener);
	}

	@Override
	public void meter(int cantidad) {
		this.saldo = this.saldo + cantidad; 
		if (this.listeners.size() > 0) {
			this.listeners.forEach(listener->{
				try {
					listener.opCorrecta(this);
				} catch (Exception e) {}
			});
		}
	}

	@Override
	public boolean sacar(int cantidad) {
		
		if ((cantidad <= 0) || (this.saldo <= 0) || (this.saldo < cantidad) ) {
			
			if (this.listeners.size() > 0) {
				this.listeners.forEach(listener->{
					try {
						listener.noHayFondos(this);
					} catch (Exception e) {}
				});
			}
			
			return false;
		} 
		
		float amount = ((float)cantidad)/100f;
		this.saldo = this.saldo - amount;
		
		if (this.listeners.size() > 0) {
			this.listeners.forEach(listener->{
				try {
					listener.opCorrecta(this);
				} catch (Exception e) {}
			});
		}
		
		return true;
	}

	@Override
	public int mostrarSaldo() {
		float valor = this.saldo * 100f;
		return (Integer.valueOf(String.valueOf(valor)));
	}

}
