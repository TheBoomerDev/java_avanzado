package main.polimorfismo.ejemplos_reales;
 

public class Main { 

	public static void main(String[] args) {
		
		// Clase que extiende al int
		Integer numero = 16;
		 
		// Tipo Nativo Int
		int num = numero;

		// Transformar el dato por casteo o por clase (si es objeto)
		float flotante = numero.floatValue();
		float flotante2 = (float) num;
		
		// OJO - Este código casca la aplicación.
		Integer num1 = null; 
		int num2 = num1.intValue();
		
		Boolean dato1 = null;		
		boolean dato2 = dato1;
	}

}
