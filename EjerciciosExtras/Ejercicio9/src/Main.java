/*
Ejercicio 9 - Arreglos

        Se solicita crear un programa que verifique si 2 arreglos son inversamente iguales, para esto se debe tener en cuenta lo siguiente:

        * arr1 = [0,1,2,3,4,5,6,7,8,9] y arr2 = [9,8,7,6,5,4,3,2,1,0] , estos son los 2 arreglos a modo ilustrativo.

        El programa deberá iterar usando un bucle for y deberá comprobar que ambos arreglos sean inversamente iguales,

        es decir el primer elemento de arr1 coincide con el ultimo de arr2, y asi sucesivamente por todos los elementos,

        si se cumple la igualdad se debe mostrar que ambos son inversamente iguales, caso contrario, no son inversamente iguales.
*/
public class Main {
    public static void main(String[] args) {
        //Arrays & variables
        int[] arr1 = {0,1,2,3,4,5,6,7,8,9};
        int[] arr2 = {9,8,7,6,5,4,3,2,1,0};
        int cont = 0;

        for (int i=0; i<10; i++){
            if (arr1[i]==arr2[10-1-i]){
                cont++;
            }
        }

        if (cont==10){
            System.out.println("Ambos son inversamente iguales");
        } else {
            System.out.println("No son inversamente iguales");
        }
    }
}