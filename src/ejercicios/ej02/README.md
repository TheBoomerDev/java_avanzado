#EJ02 - Cajero Automatico - v02


## Vamos a partir del ejercicio anterior; tanto con vuestro c�digo como el que os he suministrado en la sesi�n.



Ampliamos las posibilidades y mejoramos el c�digo hecho.

### Vamos a reFactorizar el c�digo hecho:

    [] Crearemos una clase Singleton que sea CajeroAutomatico donde estar� el c�digo de todas las operaciones a realizar
    [] Cambiamos el numeroCuenta a un string de 16 numeros, por ejemplo "1234567890123456"
    [] Modificamos el sacar dinero para que adem�s devuelva a traves de un listener los siguientes casos:
        [] Hemos llegado al limite
        [] Falta de fondos para la operaci�n
        [] La operaci�n se ha realizado de forma correcta
    [] Ampliamos en un tipo de Cuenta: CuentaBitcoin, donde el numero de cuenta es un string aleatorio de 16 hexadecimales que se genera de forma aleatoria al crear la cuenta

***( https://stackoverflow.com/questions/14622622/generating-a-random-hex-string-of-length-50-in-java-me-j2me )***

    [] Ampliamos las funciones de las cuentas de banco, pudiendo transferir entre cuentas. Le pasamos el numeroCuenta y resta la operaci�n en uno y la suma en el otro.

    [] La cuenta bitCoin usa float en lugar de int para el saldo

    [] Desde el Main SOLO debe llamarse al singleton de Cajero y a las funciones que este tenga implementadas para: 

        **crear cuenta**
        **ver cuentas -> Devuelve un array de los numeroCuenta**
        **ver saldo**
        **realizar operaci�n# EJ01 - Cajero Automatico**

 