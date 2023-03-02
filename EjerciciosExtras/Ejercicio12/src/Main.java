/*
Ejercicio 12 - Cuenta Bancaria (Herencia)

        Se requiere un sistema que permita generar cuentas bancarias a clientes, para ello se debe tener en cuenta lo siguiente.

        * los datos del titular de la cuenta deben estar completos, y no puede existir 2 titulares con el mismo dni.

        Caja de ahorro.

        * Una caja de ahorro debe pertenecer a un titular obligatoriamente.
        * tambien posee un limite de intentos de retiro en el dia (5) si pasa de ese limite, entonces no se podran realizar mas extracciones hasta el dia siguiente por mas que haya saldo disponible en la cuenta.
        * el limite de la caja de ahorro es el monto maximo que se podra retirar en el lapso de 24hs, si se llega al limite, no se podran realizar mas extracciones por mas que haya saldo disponible en la cuenta o intentos habilitados aun.

        CuentaCorriente

        * una cuenta comitente tiene un limite de descubierto, que es un monto que el banco presta cuando no hay saldo disponible,
        Ej: si el saldo es 0 en la cuenta y el limite descubierto es de 500, significa que el saldo de la cuenta puede llegar a ser -500, pero no mas que eso.
        * se debe tener en cuenta que la cuenta comitente no tiene montos maximo, ni intentos disponibles.

        Aclaracion:

        * el metodo puede extraer debe especilizarse en cada tipo de cuenta, ya que debe tener en cuenta las restricciones de la misma.
        * el metodo mostrar debe mostrar todos los datos de la cuenta, incluido el titular de la misma, saldo actual, etc.
*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}