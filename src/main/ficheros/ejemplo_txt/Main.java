package main.ficheros.ejemplo_txt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
 
		System.out.println("Lectura de Fichero");
		
		try {
		      File myObj = new File("filename.txt");
		      
		      
		      // Borrar Ficheros
		      myObj.delete(); // Se ejecuta en el momento
		      myObj.deleteOnExit(); // Cuando termina el programa -> Ficheros Temporales
		      
		      if (myObj.createNewFile()) {
		          System.out.println("File created: " + myObj.getName());
		        } else {
		          System.out.println("File already exists.");
		        }
		      
		      
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) { // Hasta el EOF - End Of File
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
