package ejercicios.ej03_complejo;

import ejercicios.ej03_complejo.BrokerMqttComplex.TOPIC;

public class Main {

	public static void main(String[] args) {
 
		System.out.println("Empezamos");
		
		BrokerMqttComplex broker = BrokerMqttComplex.getInstance();
		
		for (int i = 0; i < 20; i++) {
			final int aux = i;
			
			TOPIC topic = TOPIC.getRandom();
			
			EsperandoComplex lis = new EsperandoComplex() {

				@Override
				public void reciboMensaje(TOPIC topic, String msg) {
					String formato = "(%s): %d-> %s"; 
					System.out.println(String.format(formato, topic, aux, msg));
				}
			};
			broker.add(topic, lis);
		} 
		
		// Enviamos mensaje
		System.out.println("Enviamos mensaje");
		
		TOPIC topic = TOPIC.getRandom();
		broker.sendMessage(topic, "Hola Mundo, Hace Calor");
		
		System.out.println("Terminamos");
	}

}
