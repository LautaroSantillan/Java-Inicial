/*
Ejercicio 5 - Etapas.

        Modificar el ejercicio 4 para que ahora, podamos determinar en que etapa esta una persona en base a la edad suministrada.

        Etapas:

        bebe <= 2 años

        niño > 2 y <=8

        pre adolecente > 9 y <= 13

        adolecente > 13 y < 18

        adulto >= 18 y < 60

        vejez >= 60 años.

        realizarlo con una estructura IF, y considerar valores negativos.

        en cada caso se debera mostrar el mensaje indicando a que etapa pertenece.
*/
public class Main {
    public static void main(String[] args) {
        int edad = 19;

        //Desarrollo del ejercicio
        if(edad <= 2) {
            System.out.println("Está en la etapa de bebe");
        } else if (edad > 2 && edad <= 8) {
            System.out.println("Está en la etapa de niño");
        } else if (edad > 9 && edad <= 13) {
            System.out.println("Está en la etapa de pre adolecente");
        } else if (edad > 13 && edad < 18) {
            System.out.println("Está en la etapa de adolecente");
        } else if (edad >= 18 && edad < 60) {
            System.out.println("Está en la etapa de adulto");
        } else if (edad >= 60) {
            System.out.println("Está en la etapa de vejez");
        }
    }
}