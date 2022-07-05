package main.polimorfismo.ejemplos_reales.cuentasBanco;

public class CuentaBancoDebito extends CuentaBanco{
	
	@Override
	public void add(int dinero) {
		 this.saldo = this.saldo + dinero;
	}
	
	@Override
	public boolean get(int dinero) {
		if ((dinero <= 0) || (this.saldo <= 0) || (this.saldo < dinero) ) {
			return false;
		} 
		
		this.saldo = this.saldo - dinero;
		return true;
	}
	
	public int comprobarSaldo() {
		return this.saldo;
	}
	
}
