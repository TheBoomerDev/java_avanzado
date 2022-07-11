package main.patrones.builder;

import main.patrones.builder.models.BuilderEmail;
import main.patrones.builder.models.CorreoElectronico;

public class Main {

	public static void main(String[] args) {
		 
		BuilderEmail builder = BuilderEmail.get();
		
		// Podemos usar las funciones al objeto
		builder.setSubject("HOLA, Correo, SUBJECt");
		
		// Podemos encandenar las funciones entre ellas.
		builder = builder.setBodyMd("BODY MD").setBodyTxt("Body TXT").setBodyHtml("HTML");
		CorreoElectronico correo = builder.build();
		
		correo.send();

	}

}
