package main.patrones.singleton;

public class Main {

	public static void main(String[] args) {
 
		System.out.println("Hola");
		
		ClaseUnica obj01 = ClaseUnica.getInit(2);
		obj01.valor = 2;
		obj01.valorTotal = 1000; 
		
		ClaseUnica obj02 = ClaseUnica.getInit(1);
		obj02.valor = 1;
		obj02.valorTotal = 1000;
		
		obj01.funcion();
		obj02.funcion();
		
		System.out.println(obj01);
		System.out.println(obj02);
	}

}
