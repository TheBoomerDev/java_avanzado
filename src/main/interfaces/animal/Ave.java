package main.interfaces.animal;

import main.interfaces.animal.interfaces.PuedeVolar;

public class Ave extends Animal implements PuedeVolar {

	@Override
	public void volar() {
		System.out.println("Puedo Volar... YUJUUUUUU..");
	}
	
	

}
