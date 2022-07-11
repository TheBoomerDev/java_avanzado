package main.patrones.builder.models;

import java.util.ArrayList;
import java.util.List;

class CorreoElectronico {
	
	private List<String> listaCC = new ArrayList<String>();
	private List<String> listaBCC = new ArrayList<String>();
	
	private boolean acuseDeRecibo = false;
	
	private String subject = "";
	
	private String body = "";
	private int tipoBody = 0; // 0 - TXT | 1 - HTML | 2 - MD
	  
	public List<String> getListaCC() {
		return listaCC;
	} 

	protected void setListaCC(List<String> listaCC) {
		this.listaCC = listaCC;
	} 

	public List<String> getListaBCC() {
		return listaBCC;
	} 

	protected void setListaBCC(List<String> listaBCC) {
		this.listaBCC = listaBCC;
	}
 
	public boolean isAcuseDeRecibo() {
		return acuseDeRecibo;
	}
 
	protected void setAcuseDeRecibo(boolean acuseDeRecibo) {
		this.acuseDeRecibo = acuseDeRecibo;
	} 
	
	public String getSubject() {
		return subject;
	} 

	protected void setSubject(String subject) {
		this.subject = subject;
	} 

	public String getBody() {
		return body;
	} 

	protected void setBody(String body) {
		this.body = body;
	}
 
	public int getTipoBody() {
		return tipoBody;
	} 

	protected void setTipoBody(int tipoBody) {
		this.tipoBody = tipoBody;
	}



	public void send() {
		System.out.println("Correo Enviado");
	}
}
