package ejercicios.ej02.models;

import java.util.List;

import ejercicios.ej02.CajeroAutomatico;

public abstract class AbsCuentaBanco {
	
	protected String numeroCuenta;
	
	public abstract void meter(int cantidad);
	public abstract boolean sacar(int cantidad);
	public abstract int mostrarSaldo();
	
	@Override
	public String toString() {
		String formato = "%d -> Saldo: %d";
		return String.format(formato, this.numeroCuenta, this.mostrarSaldo());
	} 
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	} 
	
	public boolean transferir(String numeroCuenta, int cantidad) {
		
		if (cantidad > mostrarSaldo()) {
			return false;
		}
		
		CajeroAutomatico cajero = CajeroAutomatico.get();
		
		List<AbsCuentaBanco> cuentas = cajero.getCuentas();
		
		// filter -> Recoje una subLista de los elementos del Array que la comprobación sea TRUE.
		// findAny -> devuelve el primer elemento que concuerde con la comprobación.
		AbsCuentaBanco cc = cuentas.stream()
				.filter(cuenta -> numeroCuenta.equals(cuenta.getNumeroCuenta()))
				.findAny()
				.get();
		if (cc == null) return false;
		
		// ¿Que hacemos primero? Restar o Sumar - Indiferente
		try { 
			this.sacar(cantidad);
			cc.meter(cantidad);
		} catch (Exception e) {
			this.meter(cantidad);
			cc.sacar(cantidad);
			return false;
		} 
		
		return true;
	}
}
