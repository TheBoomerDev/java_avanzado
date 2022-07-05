package main.streams;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
 
		System.out.print(true);
		
		ArrayList<String> lista = new ArrayList<String>();
		
		for (int i = 0; i < lista.size(); i++) {
			
		}
		
		for (String string : lista) {
			
		}
		
		// JAVA 10 > 
		/*
		lista.forEach((p)-> {
			
		});
		
		lista.stream().filter((p)->{
			// Filtra el 
			return true;
		}).map((p)->{
			// Transformar los Objetos en otros 
			return null;
		}).find((p)->{
			// Encuentra y devuelve un obejto del la lista 
			return true;
		});
		
		//*/
		
	}

}
