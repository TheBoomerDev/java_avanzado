package main.interfaces.llamadas;

import main.interfaces.llamadas.interfaces.ClickListener;

public class SoyUnBoton {
	
	public void setListener(ClickListener listener) {
		
		int amount = 1;
		for (int i = 1; i < 100000; i++) {
			amount = amount * i + amount;
		}
		
		boolean cosasQuePasan = listener.click(""+amount);
		
		System.out.println("Estoy Dentro: "+cosasQuePasan);
	}

}
