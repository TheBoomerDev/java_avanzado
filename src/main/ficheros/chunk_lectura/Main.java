package main.ficheros.chunk_lectura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
 
		System.out.println("Lectura de Fichero");
		
		try {
		      File myObj = new File("filename.txt");
		      
		    
		      char[] myBuffer = new char[512];
		      int bytesRead = 0;
		      BufferedReader in = new BufferedReader(new FileReader(myObj));
		      while ((bytesRead = in.read(myBuffer,0,512)) != -1)
		      {
		           // bytesRead <= Aquí tenemos nuestro Chunk
		      }
		      
		      
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
