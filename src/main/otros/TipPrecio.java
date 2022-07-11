package main.otros;

public class TipPrecio {

	public static void main(String[] args) {

		// Para evitar uso de floats 
		float precioFlotante = 794.07f;
		int precioNOFlotante = 799407;
		
		float unEuroF = 1.0f;
		int unEuroI = 100;
		
		
		for (int i = 0; i < 1000; i++) {
			
			unEuroI = unEuroI + 22; 
			
		}
		
		// Lo quiero mostrar, entonces uso el Wrapper.
		System.out.println("Formato Int:"+unEuroI);
		float variable = ((0f+unEuroI)/100.0f);
		System.out.println("Formato FLoat:"+variable);
		
	}

}
