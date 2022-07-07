# EJ01 - Cajero Automatico

##Queremos hacer el motor de funcionamiento de un Cajero automático. 

[x] Para simular la Entrada de una tarjeta usaremos la clase Main y el private static void main; 
	donde usaremos las clases que necesitemos
[x] Vamos a partir de que solo vamos a tener un usuario; pero va a tener 3 cuentas de Banco: 2x Crédito, 1xDebito. 
	***Podemos usar las clases generadas en las sesiones para facilitar el desarrollo.***
[x] Las CuentaCredito tendrán un Listener en el constructor, que avisará cuando se llegue al limite de crédito con un mensaje.
[x] Las cuentas crédito tendrán un limite variable que se le pasará en el constructor. 
		***Se usará un rango (Math.Random) de entre 1000-99999***
[x] Tenemos que tener las cuentas en un ArrayList de un interface llamado CuentaBanco; con las funciones:
	*** meter, sacar, mostrarSaldo ***
[x] El funcionamiento del meter y sacar de la cuenta debito será el habitual de este tipo de cuentas.
[x] El funcionamiento del meter y sacar de las cuentas crédito será: 
	***Si tenemos saldo en cuenta, se resta del saldo***
	***Si no tenemos saldo, se resta del limite***
	***Si tenemos de ambos, se resta primero del saldo y luego del Limite***
	***Si no tenemos limite suficiente, no deja hacer la operación***
[x] La función de mostrar saldo funcionará de la siguiente forma:
	***Debito -> Print del Saldo***
	***Crédito -> Print del Saldo + Limite***
[x] Las funciones meter, sacar devolverán true en caso que se pueda realizar, y false en caso que no
[] En el Main, tenemos que hacer las siguientes operaciones:
	x***Crear las cuentas en una función init()***
	x***Listar TODAS las cuentas -> Mostrar el Saldo y el numero de cuenta***
	x***Generar un total de 100 operaciones en cadena, sobre cada una de las cuentas.***
		x***Donde se le restará o sumara un valor Random entre 500-2500.***
	x***Al finalizar las operaciones, volver a mostrar el Saldo de todas las cuentas***
	x***Por ultimo, mostrar el saldo conjunto de todas las cuentas.***