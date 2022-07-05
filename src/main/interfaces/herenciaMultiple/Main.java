package main.interfaces.herenciaMultiple;

import main.interfaces.herenciaMultiple.interfaces.MagiaDeHielo;
import main.interfaces.herenciaMultiple.interfaces.Venenos;
import main.interfaces.herenciaMultiple.profesiones.Guerrero;
import main.interfaces.herenciaMultiple.profesiones.MagoDeFuego;
import main.interfaces.herenciaMultiple.profesiones.MagoDeHielo;
import main.interfaces.herenciaMultiple.profesiones.MagoPoderoso;
import main.interfaces.herenciaMultiple.profesiones.Picaro;

public class Main {

	public static void main(String[] args) {

		Guerrero conan = new Guerrero();
		MagoDeFuego mani = new MagoDeFuego();
		MagoDeHielo luke = new MagoDeHielo();
		Picaro vince = new Picaro();
		
		MagoPoderoso venger = new MagoPoderoso();
		venger.bolaDeFuego();
		venger.congelar();
		venger.envenenar();
		venger.invocarCharizard();
		
		// NO Casteo a una clase que implement
		// vince = (Picaro) venger;
		// SI Casteo a la interface
		Venenos bender = (Venenos) venger;
		
		// Podemos usar un objeto que implemente la interface
		MagiaDeHielo hielo0 = luke;
		
		// NOTA: PODEMOS CREAR UN OBJETO DE UNA INTERFACE
		
		MagiaDeHielo hielo = new MagiaDeHielo() {
			
			@Override
			public void ventisca() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void lanzarAlMuroDelNorte() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void congelar() {
				System.out.println("Aliento de Hielo");
			}
		};
		
		
		hielo.congelar();
		
		MagiaDeHielo hielo2 = new MagiaDeHielo() {
			
			@Override
			public void ventisca() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void lanzarAlMuroDelNorte() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void congelar() {
				System.out.println("Pedo de pingüino");
			}
		};
		hielo2.congelar();
		
	}

}
