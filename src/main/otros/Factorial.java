package main.otros;

public class Factorial {
	
	public static int factorial(int num){
		if(num <= 1){
			return 1;
		}
	 
		return num * factorial(num-1);
	}

	public static void main(String[] args) {
		
		int numeroFactorial = factorial(5);

	}

}
