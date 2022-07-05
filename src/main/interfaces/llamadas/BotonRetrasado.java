package main.interfaces.llamadas;

import main.interfaces.llamadas.interfaces.ClickListener;

public class BotonRetrasado {
	
	private ClickListener listener;
	private String cadena; 
	
	public BotonRetrasado(ClickListener listener) {
		this.listener = listener;
	}
	
	public void setTexto(String texto) {
		this.cadena = texto;
	}
	
	public void doClick() {
		if (this.listener == null) return;
		
		this.listener.click(cadena);
	}

}
