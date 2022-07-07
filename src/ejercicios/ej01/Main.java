package ejercicios.ej01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ejercicios.ej01.interfaces.CuentaBanco;
import ejercicios.ej01.tiposCuenta.CuentaCredito;
import ejercicios.ej01.tiposCuenta.CuentaDebito;

public class Main {
	
	private static int getRandom(int min, int max) {
		return rand.nextInt((min - max) + 1) + min;
	}
	
	private static Random rand = new Random(); 
	
	private List<CuentaBanco> cuentas = new ArrayList<CuentaBanco>();		
	
	public void init() {
		int limitMax = 99999;
		int limitMin = 1000;
		
		int numeroCuenta = getRandom(limitMin, limitMax);
		CuentaDebito cc3 = new CuentaDebito(numeroCuenta);
		cuentas.add(cc3);
		
		
		try {
			int limite = getRandom(limitMin, limitMax);
			numeroCuenta = getRandom(99999, 999999);
			CuentaCredito cuenta = new CuentaCredito(numeroCuenta, limite, null);
			cuentas.add(cuenta);
		} catch (Exception e) { 
			e.printStackTrace();
		}
		
		try {
			int limite = getRandom(limitMin, limitMax);
			numeroCuenta = getRandom(99999, 999999);
			CuentaCredito cuenta = new CuentaCredito(numeroCuenta, limite, null);
			cuentas.add(cuenta);
		} catch (Exception e) { 
			e.printStackTrace();
		}
		
	}
	
	public void sumaEnTodas(int cantidad) {
		cuentas.forEach(cuenta->{
			cuenta.meter(cantidad);
		});
	}
	 
	public void restaEnTodas(int cantidad) {
		cuentas.forEach(cuenta->{
			cuenta.sacar(cantidad);
		});
	}
	
	public void mostrarCuentas() {
		 
		this.cuentas.forEach(System.out::println); 
		
	}
	
	public int recogerSaldo() {
		return 0;
	}

	public static void main(String[] args) {
		 
		Main app = new Main();
		app.init();
		app.mostrarCuentas();
		
		int numeroOperaciones = 100;
		for (int i = 0; i < numeroOperaciones; i++) {
			 
			int cantidad = getRandom(500, 2500);
			boolean suma = rand.nextBoolean();
			
			if (suma) {
				// Suma
				app.sumaEnTodas(cantidad);
			}else {
				// Resta
				app.restaEnTodas(cantidad);
			} 
		} 
		app.mostrarCuentas();
		
 
		System.out.print(true);
	}

}
