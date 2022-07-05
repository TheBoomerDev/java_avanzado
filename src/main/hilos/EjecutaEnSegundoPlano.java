package main.hilos;

public class EjecutaEnSegundoPlano extends Thread {
	
	private String texto = "";
	
	public EjecutaEnSegundoPlano(String texto) {
		this.texto = texto;
	}

	@Override
	public void run() {
	    for(int i=1;i<6;i++){    
            try  
            {  
                Thread.sleep(1500);  
            }catch(InterruptedException e){System.out.println(e);}    
            System.out.println(texto+" ->"+i);    
        }    
	}
}
