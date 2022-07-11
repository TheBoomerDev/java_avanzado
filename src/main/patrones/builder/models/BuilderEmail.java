package main.patrones.builder.models;

public class BuilderEmail {
	
	private CorreoElectronico correo;
	
	private BuilderEmail () {} 
	
	// Metodo Inicializador
	public static BuilderEmail get() {
		BuilderEmail instance =  new BuilderEmail();
		instance.correo = new CorreoElectronico();
		return instance;
	}
	
	// SETTER
	public BuilderEmail setSubject(String subject) {
		this.correo.setSubject(subject);
		return this;
	}
	
	public BuilderEmail setBodyHtml(String html) {
		this.correo.setBody(html);
		this.correo.setTipoBody(1);
		return this;
	}
	
	public BuilderEmail setBodyTxt(String html) {
		this.correo.setBody(html);
		this.correo.setTipoBody(0);
		return this;
	}
	
	public BuilderEmail setBodyMd(String md) {
		this.correo.setBody(md);
		this.correo.setTipoBody(2);
		return this;
	}
	
	// Metodo Constructor
	public CorreoElectronico build() {
		return this.correo;
	}

}
