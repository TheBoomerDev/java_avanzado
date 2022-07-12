package ejercicios.ej03_simple;

public class Main {

	public static void main(String[] args) {
 
		System.out.println("Empezamos");
		
		BrokerMqtt broker = BrokerMqtt.getInstance();
		
		for (int i = 0; i < 20; i++) {
			final int aux = i;
			
			Esperando lis = new Esperando() {

				@Override
				public void reciboMensaje(String msg) {
					String formato = "Recibió: %d-> %s"; 
					System.out.println(String.format(formato, aux, msg));
				}
			};
			broker.add(lis);
		} 
		
		// Enviamos mensaje
		System.out.println("Enviamos mensaje");
		broker.sendMessage("Hola Mundo, Hace Calor");
		
		System.out.println("Terminamos");
	}

}
