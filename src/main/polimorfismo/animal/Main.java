package main.polimorfismo.animal;

public class Main {

	public static void main(String[] args) {
 
		// Animala Generico
		Animal animal = new Animal();
		animal.come(100);
		animal.recibeDanho(100);
		boolean vive = animal.sigueVivo();
		
		// Pez -> Animal Tipo  Pez
		Pez pez = new Pez();
		pez.nada(); // Solo lo pueden hacer los Peces
		pez.come(100);
		pez.recibeDanho(100);
		boolean vivePez = pez.sigueVivo();
		
		// Ave -> Animal Tipo Ave
		Ave pajaro = new Ave();
		// pajaro.nada(); // Un Ave no puede hacer lo que el Pez
		pajaro.volar(); // Solo lo pueden hacer los pajaros
		pajaro.come(100);
		pajaro.recibeDanho(100);
		boolean viveAve = pajaro.sigueVivo();
		
		
		// POLIFORMISMO
		Animal ani2 = new Pez();
		Animal ani3 = new Ave();
		
		// No se puede hacer por que no extends uno del otro
		// Pez pez = new Ave();
		// Ave ave = new Pez();
		
		// NO deja por que no podemos asegurar que tenga el mismo código.
		// Pez pez = new Animal();

		// Rompe la reglas y nos deja castear a un tipo heredado
		// NO puede usar las funciones de pez, pero si las de Animal
		pez = (Pez) new Animal();
		pez.nada();
		
		// Una cafrada, NO LO HAGAIS
		pez = (Pez) (Animal) new Ave();
		((Ave)(Animal)pez).volar();
		
		
		// Donda cambe un animal, caben todos
		Animal maniMal = new Ave();
		maniMal.come(100);
		maniMal.recibeDanho(100);
		((Ave)maniMal).volar();
		
		maniMal = new Pez();
		((Pez)maniMal).nada();
		
		maniMal = new Terrestre();
		// ((Pez)maniMal).nada(); // Falla el código
		((Terrestre)maniMal).desplaza();
		
		
	}

}
