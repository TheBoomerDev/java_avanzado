package ejercicios.ej02;

import java.util.ArrayList;
import java.util.List;

import ejercicios.ej02.common.Tools;
import ejercicios.ej02.models.AbsCuentaBanco;
import ejercicios.ej02.models.CuentaBitcoin;
import ejercicios.ej02.models.CuentaCredito;
import ejercicios.ej02.models.CuentaDebito;

public class CajeroAutomatico {
	
	public static enum TIPOS_CUENTA{
		CREDITO,
		DEBITO, 
		BITCOIN
	}
	
	private List<AbsCuentaBanco> cuentas = new ArrayList<AbsCuentaBanco>();
	
	
	private CajeroAutomatico() {
		
	}
	
	private static CajeroAutomatico instance;
	
	public static CajeroAutomatico get() {
		if (instance == null) instance = new CajeroAutomatico();
		return instance;
	}

	public List<AbsCuentaBanco> getCuentas() {
		return cuentas;
	}
	
	// ver cuentas -> Devuelve un array de los numeroCuenta
	
	// ver saldo
	
	// realizar operación
	
	

	/// crear cuenta -> Uso de Patrón Factoria
	public AbsCuentaBanco crear(TIPOS_CUENTA tipoCuenta) throws Exception {
		
		String numeroCuenta = Tools.getRandomHexString(10);
		switch (tipoCuenta) {
		case BITCOIN: {
			return new CuentaBitcoin(null);
		}
		case DEBITO: {
			return new CuentaDebito(numeroCuenta, null);
		}
		case CREDITO: {
			return new CuentaCredito(numeroCuenta, 0, null);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + tipoCuenta);
		}
		
	}
	
	
	

}
