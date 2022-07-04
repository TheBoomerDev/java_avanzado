package main.polimorfismo.ejemplos_reales.cuentasBanco;

public class CuentaBancoCredito extends CuentaBanco {
	
	private int limiteCredito = 10000;
	
	@Override 
	public void add(int dinero) {
		 this.saldo = this.saldo + dinero;
	}
	
	@Override
	public boolean get(int dinero) {
		if ((this.saldo + this.limiteCredito) >= dinero) {
			if (this.saldo <= dinero) {
				this.limiteCredito = (this.saldo - dinero);
				this.saldo = 0;
			}else {
				this.saldo = this.saldo - dinero;
			}
			return true;
		}
		
		return false;
	}
	
	public int comprobarLimite() {
		return this.limiteCredito;
	}

	

}
