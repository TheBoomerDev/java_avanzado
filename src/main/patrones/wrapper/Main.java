package main.patrones.wrapper;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
 

		// Adaptando un objeto en otro
		int valorNativo = 0;
		Integer valorClase = 0;
		valorClase = valorNativo;
		
		// Si, esto tambien es un Wrapper
		String str = valorClase.toString();
		
		
		
		// Ejemplo de Wrapper entre Clases
		List<String> listado = new ArrayList<String>();
		listado.add("x");
		listado.add("x");
		listado.add("x");
		listado.add("x");
		listado.add("x"); 
		
		ObjectoComplejo obj01 = new ObjectoComplejo();
		obj01.setValor(100);
		obj01.setName("OBJECT-01");
		obj01.setListado(listado);
		
		// llamamos al wrapper
		ObjectoSimple objSimple = obj01.toSimple();
		
		
		
	}

}
