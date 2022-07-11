package ejercicios.ej02.interfaces;
 
import ejercicios.ej02.models.AbsCuentaBanco; 

public interface ObservadorCuenta {
	
	//  Hemos llegado al limite
	public void limiteSobrepasado(AbsCuentaBanco cuenta);
	
	// Falta de fondos para la operación
	public void noHayFondos(AbsCuentaBanco cuenta);
	
	// La operación se ha realizado de forma correcta
	public void opCorrecta(AbsCuentaBanco cuenta);

}
