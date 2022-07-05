package main.hilos;

public class Main {

	public static void main(String[] args) {
 
		EjecutaEnSegundoPlano ej01 = new EjecutaEnSegundoPlano("01");
		EjecutaEnSegundoPlano ej02 = new EjecutaEnSegundoPlano("02");
		EjecutaEnSegundoPlano ej03 = new EjecutaEnSegundoPlano("03");
		
		ej01.start();
		ej02.start();
		ej03.start(); 
		
		
	}

}
