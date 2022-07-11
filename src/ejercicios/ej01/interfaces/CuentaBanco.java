package ejercicios.ej01.interfaces;

public abstract class CuentaBanco {
	
	protected String numeroCuenta;
	
	public abstract void meter(int cantidad);
	public abstract boolean sacar(int cantidad);
	public abstract int mostrarSaldo();
	
	@Override
	public String toString() {
		String formato = "%s -> Saldo: %d";
		return String.format(formato, this.numeroCuenta, this.mostrarSaldo());
	} 
}
