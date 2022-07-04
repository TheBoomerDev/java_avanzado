package main.polimorfismo.ejemplos_reales.cuentasBanco;

public abstract class CuentaBanco {
	
	protected int saldo = 1000;
	
	// NO tenemos que crear el cuerpo de la función, se crea OBLIGATORIAMENTE
	// al crear una clase que herede de esta
	public abstract void add(int dinero);
	
	public abstract boolean get(int dinero);
}
