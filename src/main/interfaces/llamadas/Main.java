package main.interfaces.llamadas;

import main.interfaces.llamadas.interfaces.ClickListener;
import main.interfaces.llamadas.interfaces.Finnished;

public class Main {
	
	private static void ostias() {
		System.out.println("Afu... que lio");
	}
	
	private static void sleep(int ms) {
		try {
			Thread.sleep(ms); // Wait 1seg - Sleep 1s
		} catch (InterruptedException e) { 
			e.printStackTrace();
		} 
	}
	
	private static Finnished fin = new Finnished() {
		
		@Override
		public void seTermino() {
			System.out.println("FIN DE PROGRAMA");
		}
	};

	public static void main(String[] args) {
		
		ClickListener listener = null;
		SoyUnBoton boton = new SoyUnBoton(); 
		BotonRetrasado boton2 = new BotonRetrasado(listener);
		  
		listener = new ClickListener() {
			
			@Override
			public boolean click(String cadena) {

				System.out.println("El Ganador es..."+cadena);
				boton.setListener(new ClickListener() {
					
					@Override
					public boolean click(String cadena) { 
						System.out.println("Afu:"+cadena);
						return false;
					}
				});
				return false;
			}
		}; 
		
		boton.setListener(new ClickListener() {
			
			@Override
			public boolean click(String cadena) {
				
				boton2.setTexto("TEXTO:"+cadena);
				sleep(1000);
				System.out.println("Estoy Fuera: "+cadena);
				ostias();
				
				sleep(3000);
				
				boton2.doClick();
				
				fin.seTermino();
				
				// ESTE ES EL FALLO DEL 75% QUE USAN LISTENER
				boton.setListener(this);
				
				return false;
			}
		});
		
	}

}
