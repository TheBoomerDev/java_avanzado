package ejercicios.ej03_complejo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class BrokerMqttComplex {
	
	private static Random rand = new Random(); 
	
	// Cógido más pequeño para un singleton en Java
	private static BrokerMqttComplex instance = new BrokerMqttComplex();
	
	private BrokerMqttComplex() {}
	
	public static BrokerMqttComplex getInstance() {
		return instance;
	}
	
	// Tipos de Topic
	
	public static enum TOPIC {
		entrada,
		jardin,
		garaje,
		cocina;
		
		public static TOPIC getRandom() {
	        return values()[(int) (Math.random() * values().length)];
	    }
	}  
	
	
	// Un topic -> Un solo tipo de mensaje
	private HashMap<TOPIC, ArrayList<EsperandoComplex>> listeners = new HashMap<TOPIC, ArrayList<EsperandoComplex>>();
	
	// añadir un listener
	public void add(TOPIC topic, EsperandoComplex listener) {
		ArrayList<EsperandoComplex> lista = this.listeners.get(topic);
		if (lista == null) lista = new ArrayList<EsperandoComplex>();
		lista.add(listener);
		this.listeners.put(topic, lista);
	}
	
	// Quitar un Listener
	public void del(TOPIC topic, EsperandoComplex listener) { 
		ArrayList<EsperandoComplex> lista = this.listeners.get(topic);
		if (lista == null) return;
		lista.remove(listener);
		this.listeners.put(topic, lista);
	}
	
	// Recibir un mensaje -> MQTT el que recibe
	public void sendMessage(TOPIC topic, String msg) {
		
		ArrayList<EsperandoComplex> lista = this.listeners.get(topic);
		for (EsperandoComplex esperando : lista) {
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
						esperando.reciboMensaje(topic, msg);
					} catch (Exception e) {
						listeners.remove(esperando);
					}
				} 
			 });
			 t1.start();
			
		}
		
	}

}
