package main.polimorfismo.animal;

public class Animal {
	
	private boolean estaVivo = true;
	private int vida = 100;
	private boolean enPeligroDeExtincion = false;
	
	public boolean sigueVivo() {
		return this.estaVivo;
	}
	
	public void come(int vida) {
		if (vida < 0) vida = vida * -1;
		this.vida = this.vida + vida;
	}
	
	public void recibeDanho(int vida) {
		if (!this.estaVivo) {
			return;
		}
		if (vida > 0) vida = vida * -1;
		this.vida = this.vida - vida;
		if (this.vida <= 0) this.estaVivo = false;
	}

	protected boolean enPeligro() {
		return this.enPeligroDeExtincion;
	}
}
