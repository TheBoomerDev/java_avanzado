package main.otros;

import java.util.Random;

public class EjemploRandom {

	public static void main(String[] args) {
		Random rand = new Random(); 
	
		int limitMax = 100;
		int limitMin = 1;
		
		int v1 =  rand.nextInt((limitMax - limitMin) + 1) + limitMin;
		int v2 =  rand.nextInt((limitMax - limitMin) + 1) + limitMin;
		int v3 =  rand.nextInt((limitMax - limitMin) + 1) + limitMin;
		int v4 =  rand.nextInt((limitMax - limitMin) + 1) + limitMin;
		int v5 =  rand.nextInt((limitMax - limitMin) + 1) + limitMin;
		int v6 =  rand.nextInt((limitMax - limitMin) + 1) + limitMin;
		int v7 =  rand.nextInt((limitMax - limitMin) + 1) + limitMin;
		
		
		String formateado = "%s - %s - %s - %s - %s - %s - %s";
		System.out.println(String.format(formateado, ""+v1,""+v2,""+v3,""+v4,""+v5,""+v6,""+v7));
	}
	
}
