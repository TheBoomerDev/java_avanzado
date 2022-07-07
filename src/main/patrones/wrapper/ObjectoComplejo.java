package main.patrones.wrapper;

import java.util.ArrayList;
import java.util.List;

public class ObjectoComplejo {
	
	private int valor = 0;
	private String name = "";
	
	private List<String> listado = new ArrayList<String>();
	
	
	
	public int getValor() {
		return valor;
	}



	public void setValor(int valor) {
		this.valor = valor;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public List<String> getListado() {
		return listado;
	}



	public void setListado(List<String> listado) {
		this.listado = listado;
	}



	public ObjectoSimple toSimple() {
		ObjectoSimple obj = new ObjectoSimple();
		
		obj.setAmountList(listado.size());
		obj.setName(name);
		obj.setValor(valor);
		
		return obj;
	}

}
