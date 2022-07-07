package main.patrones.singleton;

public class ClaseUnica {

	public int valor = 0;
	public int valorTotal= 0;
	public void funcion() {
		System.out.println("HOLA:"+valor);
	}
	
	private ClaseUnica(int valor) {
		this.valor = valor;
	}
	
	private static ClaseUnica unicaInstancia;
	public static ClaseUnica getInit(int valor) {
		
		if (unicaInstancia == null) {
			unicaInstancia = new ClaseUnica(valor);
		}
		unicaInstancia.valor = valor;
		return unicaInstancia;
	}
	
	
	
}
