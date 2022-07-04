package main.polimorfismo.ejemplos_reales.cuentasBanco;

public class Main {

	public static void main(String[] args) {
 
		// Me da igual el tipo de cuenta de banco que sea
		// siempre trabajo con las mismas funciones.
		
		CuentaBanco cuenta1 = new CuentaBancoDebito();
		cuenta1.add(1000);
		cuenta1.get(1000);
		((CuentaBancoDebito)cuenta1).comprobarSaldo();
		
		cuenta1 = new CuentaBancoCredito();
		cuenta1.add(1000);
		cuenta1.get(1000);
		((CuentaBancoCredito)cuenta1).comprobarLimite();
		
		
		// ESTO ROMPE LA APP
		((CuentaBancoDebito)cuenta1).comprobarSaldo();
		
		
		

	}

}
