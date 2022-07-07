# EJ01 - Cajero Automatico

##Queremos hacer el motor de funcionamiento de un Cajero autom�tico. 

[x] Para simular la Entrada de una tarjeta usaremos la clase Main y el private static void main; 
	donde usaremos las clases que necesitemos
[x] Vamos a partir de que solo vamos a tener un usuario; pero va a tener 3 cuentas de Banco: 2x Cr�dito, 1xDebito. 
	***Podemos usar las clases generadas en las sesiones para facilitar el desarrollo.***
[x] Las CuentaCredito tendr�n un Listener en el constructor, que avisar� cuando se llegue al limite de cr�dito con un mensaje.
[x] Las cuentas cr�dito tendr�n un limite variable que se le pasar� en el constructor. 
		***Se usar� un rango (Math.Random) de entre 1000-99999***
[x] Tenemos que tener las cuentas en un ArrayList de un interface llamado CuentaBanco; con las funciones:
	*** meter, sacar, mostrarSaldo ***
[x] El funcionamiento del meter y sacar de la cuenta debito ser� el habitual de este tipo de cuentas.
[x] El funcionamiento del meter y sacar de las cuentas cr�dito ser�: 
	***Si tenemos saldo en cuenta, se resta del saldo***
	***Si no tenemos saldo, se resta del limite***
	***Si tenemos de ambos, se resta primero del saldo y luego del Limite***
	***Si no tenemos limite suficiente, no deja hacer la operaci�n***
[x] La funci�n de mostrar saldo funcionar� de la siguiente forma:
	***Debito -> Print del Saldo***
	***Cr�dito -> Print del Saldo + Limite***
[x] Las funciones meter, sacar devolver�n true en caso que se pueda realizar, y false en caso que no
[] En el Main, tenemos que hacer las siguientes operaciones:
	x***Crear las cuentas en una funci�n init()***
	x***Listar TODAS las cuentas -> Mostrar el Saldo y el numero de cuenta***
	x***Generar un total de 100 operaciones en cadena, sobre cada una de las cuentas.***
		x***Donde se le restar� o sumara un valor Random entre 500-2500.***
	x***Al finalizar las operaciones, volver a mostrar el Saldo de todas las cuentas***
	x***Por ultimo, mostrar el saldo conjunto de todas las cuentas.***