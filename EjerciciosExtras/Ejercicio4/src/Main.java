/*
Ejercicio 4 - Mayoria de Edad

        Realizar un programa donde se determine una persona es mayor de edad o no.

        Se debe tener en cuenta que se considera mayor de edad si la edad es mayor o igual a 18 años.

        la edad debe ser elegida por el usuario, y debera mostrar un mensaje indicado “Es mayor de edad” o caso contrario, “Es menor de edad”
*/
public class Main {
    public static void main(String[] args) {
        int edad = 19;

        //Desarrollo para determinar la mayoría de edad
        if(edad >= 18){
            System.out.println("Es mayor de edad ya que tiene: "+edad);
        } else {
            System.out.println("Es menor de edad ya que tiene: "+edad);
        }
    }
}