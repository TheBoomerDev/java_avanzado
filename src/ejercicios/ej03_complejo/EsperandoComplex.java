package ejercicios.ej03_complejo;

import ejercicios.ej03_complejo.BrokerMqttComplex.TOPIC;

public interface EsperandoComplex {
	
	public void reciboMensaje(TOPIC topic, String msg);

}
