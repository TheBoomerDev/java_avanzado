package main.streams;

import java.util.ArrayList;

import ejercicios.ej01.interfaces.CuentaBanco;

public class Main {
	
	public static void muestrame (String cadena) {
		System.out.println(cadena);
	}

	public static void main(String[] args) {
 
		System.out.print(true);
		
		ArrayList<String> lista = new ArrayList<String>();
		
		// Ambas hacen lo mismo, pero usando funciones propias o de sistema.
		lista.forEach(Main::muestrame);
		lista.forEach(System.out::println);
		
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
