package main.interfaces.animal;

import main.interfaces.animal.interfaces.PuedeNadar;
import main.interfaces.animal.interfaces.PuedeVolar;

public class Main {

	public static void main(String[] args) {
 
		 /*
		  * Ejemplo de Interfaces
		  */
		
		// Necesito un Animal que Nade
		PuedeNadar nada1 = new Pez();
		PuedeNadar nada2 = new Humano();
		Terrestre terrestre = new Terrestre();
		// NO IMPLEMENTA NADAR
		//nada1 = terrestre;
		
		// Para hacer que nade, necesito especificarle que es un animal que nada
		Terrestre terrestre1 = new Humano();
		nada1 = (Humano)terrestre1; 
		
		// Como implementa ambas Interfaces, puede hacer lo de las ambas
		PezVolador pezVolador = new PezVolador();
		pezVolador.nada();
		pezVolador.volar();
		pezVolador.come(100);
		
		// Un objecto que implemente la interface
		PuedeVolar volar = pezVolador;
		PuedeNadar nada = pezVolador;
		
	}

}
