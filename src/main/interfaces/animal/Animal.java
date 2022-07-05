package main.interfaces.animal;

public abstract class Animal {
	
	private boolean estaVivo = true;
	private int vida = 100;
	
	public boolean sigueVivo() {
		return this.estaVivo;
	}
	
	public void come(int vida) {
		this.vida = this.vida + vida;
	}
	
	public void recibeDanho(int vida) {
		if (!this.estaVivo) {
			return;
		}
		this.vida = this.vida - vida;
		if (this.vida <= 0) this.estaVivo = false;
	}

}
