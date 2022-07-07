package main.hilos;

import java.util.Timer;
import java.util.TimerTask;

public class Scheduler {

	public static void main(String[] args) {
		
		System.out.println("Vaya forma de terminar la Sesion");
		
		int dentroDe = 1000;
		int repitesEn = 5000;
	
		Timer timer = new Timer(); 
		timer.schedule( new TimerTask() { 
		    public void run() { 
		    	
		    	System.out.println("Adios, Por Hoy");
		    	
		    } 
		}, dentroDe, repitesEn);
		
		
		timer.schedule( new TimerTask() { 
		    public void run() { 
		    	
		    	System.out.println("Esto es El Fin Por Hoy");
		    	
		    } 
		}, 15000);

	}

}
