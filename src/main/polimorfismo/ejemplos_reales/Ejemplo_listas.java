package main.polimorfismo.ejemplos_reales;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Ejemplo_listas {
	// https://www.softwaretestinghelp.com/wp-content/qa/uploads/2020/02/List-in-Java.png

	public static void main(String[] args) {
		
		// Array Generico
		List<String> lista = new ArrayList<String>();
		lista.add(""); // Añadimos un Elemento
		lista.remove(0); // Vamos a pensar quitar un elemento 
		
		// Lista Enlazada
		lista = new LinkedList<String>();
		lista.add(""); // Añadimos un Elemento
		lista.remove(0); // Vamos a pensar quitar un elemento 
		((LinkedList)lista).push("frase"); // Recoger
		((LinkedList)lista).pop(); // Quitar
		
		// Tenemos un Pila
		lista = new Stack<String>();
		lista.add(""); // Añadimos un Elemento
		lista.remove(0); // Vamos a pensar quitar un elemento 

	}

}
