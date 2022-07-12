package main.ficheros.ej_configurador;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	private static final String FICHERO = "config.cfg";
	
	private static File fillEmptyConfig (File fichero) throws IOException {
		
		if (!fichero.canWrite()) {
			return fichero;
		}
		
		String formato = "%s=%s\n";
		// Configuración por defecto
		FileWriter myWriter = new FileWriter(fichero);
		
		String str = String.format(formato, "DEBUG", "TRUE");
	    myWriter.write(str);
	    
	    str = String.format(formato, "HOST", "https://api.google.com");
	    myWriter.write(str);
	    
	    str = String.format(formato, "EMAIL_CONTACT", "email@email.com");
	    myWriter.write(str);
	    
	    myWriter.close();
	    
	    return fichero;
	
	
	}
	
	public static void readConfig(File fichero) throws FileNotFoundException {
		
		if (!fichero.canRead()) {
			return;
		}
		
		// Lector de Fichero
		Scanner myReader = new Scanner(fichero); 
		
		// Hasta el EOF - End Of File
		while (myReader.hasNextLine()) { 
	        String linea = myReader.nextLine();
	        String[] lista = linea.split("=");
	    
	        
	        // Recogemos el clave valor => DEBUG=TRUE
	        String key = lista[0];
	        String value = lista[1];
	        
	    }
	    myReader.close();
	}
	
	public static void main(String[] args) throws IOException {
 
		System.out.println("Ejemplo Configurador");
		
		File fichero = new File(FICHERO);
		
		// Si no existe, lo creamos
		if (!fichero.exists()) {
			fichero.createNewFile(); // Crea el fichero
			
			// Crea un fichero temporal, se borra al salir.
			File fileTemp = fichero.createTempFile("tmp_", "_tmp"); // Lo genera en la carpeta temporal del S.O. 
			// System.out.println(fileTemp);
			
			// Rellenamos si no existe
			fillEmptyConfig(fichero);
			
		}
		
		// Leemos la información
		readConfig(fichero);
		
		System.out.println("Fin Ejemplo Configurador"); 
		
		 
	}

}
