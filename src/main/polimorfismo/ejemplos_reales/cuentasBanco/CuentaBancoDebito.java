package main.polimorfismo.ejemplos_reales.cuentasBanco;

public class CuentaBancoDebito extends CuentaBanco{
	
	@Override
	public void add(int dinero) {
		 this.saldo = this.saldo + dinero;
	}
	
	@Override
	public boolean get(int dinero) {
		if (this.saldo >= dinero) {
			this.saldo = this.saldo - dinero;
			return true;
		}
		
		return false;
	}
	
	public int comprobarSaldo() {
		return this.saldo;
	}
	
}
