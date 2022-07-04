package main.polimorfismo.ejemplos_reales.cuentasBanco;

public abstract class CuentaBanco {
	
	protected int saldo = 1000;
	
	public abstract void add(int dinero);
	
	public abstract boolean get(int dinero);
}
