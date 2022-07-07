package ejercicios.ej01;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

import ejercicios.ej01.interfaces.CuentaBanco;
import ejercicios.ej01.interfaces.LlegadaLimite;
import ejercicios.ej01.tiposCuenta.CuentaCredito;
import ejercicios.ej01.tiposCuenta.CuentaDebito;

public class Main {
	
	private static int getRandom(int min, int max) {
		return rand.nextInt((max - min) + 1) + min;
	}
	
	private static Random rand = new Random(); 
	
	private List<CuentaBanco> cuentas = new ArrayList<CuentaBanco>();	
	
	private LlegadaLimite listener = new LlegadaLimite() {
		
		@Override
		public void limiteSobrepasado(CuentaBanco cuenta) {
			System.out.println("Hemos llegado al Limite:"+cuenta);
		}
	};
	
	private CuentaBanco getNewCuenta(boolean debito, int limite, LlegadaLimite listener) throws Exception {
		int limitMax = 99999;
		int limitMin = 1000;
		int numeroCuenta = getRandom(limitMin, limitMax);
		
		if (debito) {
			// Cuenta Debito
			return new CuentaDebito(numeroCuenta, listener);
		}else {
			// Cuenta Credito
			return new CuentaCredito(numeroCuenta, limite, listener);
		}
		
	}
	
	public void init() throws Exception {
		int limitMax = 99999;
		int limitMin = 1000;
		CuentaBanco cuenta = getNewCuenta(true, 0, listener);
		cuentas.add(cuenta);
		
		int limite1 = getRandom(limitMin, limitMax);
		CuentaBanco cuenta2 = getNewCuenta(false, limite1, listener);
		cuentas.add(cuenta2);
		
		int limite2 = getRandom(limitMin, limitMax);
		CuentaBanco cuenta3 = getNewCuenta(false, limite2, listener);
		cuentas.add(cuenta3);
		
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
		
		// FORMA 1
		int saldo = 0;
		for (CuentaBanco cuenta : cuentas) {
			saldo = saldo + cuenta.mostrarSaldo();
		} 
		
		// FORMA 2
		Integer saldoCuentas = cuentas.stream().map(cuenta->{
			return cuenta.mostrarSaldo();
		}).reduce(0, Integer::sum);		 
		System.out.println("SALDO TOTAL:" + saldoCuentas);
		
		// FORMA 3
		Optional<Integer> sumaSaldo = cuentas.stream().map(cuenta->{
			return cuenta.mostrarSaldo();
		}).reduce((acumulador, saldoCuenta)-> {
		    return acumulador + saldoCuenta;
	    });
		System.out.println("SALDO TOTAL:" + sumaSaldo.get());
		
		return saldo;
	}

	public static void main(String[] args) {
		 
		Main app = new Main();
		try {
			app.init();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Problema Con Las Cuentas");
			return;
		}
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
		app.recogerSaldo();
 
		System.out.print(true);
	}

}
