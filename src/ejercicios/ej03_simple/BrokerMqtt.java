package ejercicios.ej03_simple;

import java.util.ArrayList;
import java.util.Random;

public class BrokerMqtt {
	
	private static Random rand = new Random(); 
	
	// Cógido más pequeño para un singleton en Java
	private static BrokerMqtt instance = new BrokerMqtt();
	
	private BrokerMqtt() {}
	
	public static BrokerMqtt getInstance() {
		return instance;
	}
	
	
	// Un topic -> Un solo tipo de mensaje
	private ArrayList<Esperando> listeners = new ArrayList<Esperando>();
	
	// añadir un listener
	public void add(Esperando listener) {
		this.listeners.add(listener);
	}
	
	// Quitar un Listener
	public void del(Esperando listener) {
		this.listeners.remove(listener);
	}
	
	// Recibir un mensaje -> MQTT el que recibe
	public void sendMessage(String msg) {
		
		for (Esperando esperando : listeners) {
			if (esperando == null) continue;
			
			 Thread t1 =new Thread(new Runnable() {
 
				@Override
				public void run() {
					// Esperamos un tiempo random entre 100ms y 1,5s
					int min = 100;
					int max = 1500;
					int millis = rand.nextInt((max - min) + 1) + min;
					
					try {
						Thread.sleep(millis);
						
						// Despues de esperar un tiempo random, manda la señal al hilo del Listener
						esperando.reciboMensaje(msg);
					} catch (Exception e) {
						listeners.remove(esperando);
					}
				} 
			 });
			 t1.start();
			
		}
		
	}

}
