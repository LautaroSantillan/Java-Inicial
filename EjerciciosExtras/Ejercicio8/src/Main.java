/*
Ejercicio 8 : numeros pares e impares.

        Realizar un programa que dado un determinado nro elegido al azar, permita saber si el mismo es par o impar.

        Se deberá mostrar un mensaje por pantalla indicando el resultado.
*/
public class Main {
    public static void main(String[] args) {
        int numRandom = 88;
        System.out.println("El número random elegido es: "+numRandom);

        //Desarrollo
        if(numRandom % 2 == 0) {
            System.out.println("Es PAR");
        } else {
            System.out.println("Es IMPAR");
        }
    }
}