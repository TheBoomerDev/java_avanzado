package main.interfaces.llamadas;

import main.interfaces.llamadas.interfaces.ClickListener;

public class Main {
	
	private static void ostias() {
		System.out.println("Afu... que lio");
	}

	public static void main(String[] args) {
  
		
		SoyUnBoton boton = new SoyUnBoton(); 
		
		boton.setListener(new ClickListener() {
			
			@Override
			public boolean click(String cadena) {
			
				System.out.println("Estoy Fuera: "+cadena);
				ostias();
				return false;
			}
		});
		
	}

}
