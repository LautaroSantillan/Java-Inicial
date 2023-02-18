/*
Ejercicio 6 - divisor

        Realizar un programa que dado 2 numeros permita realizar la división, muestre el resultado y el resto.

        El programa debera realizar un verificación de los numeros ingresados, donde si nro1 es menor a nro2, se deberan intercambiar sus valores, además se debe tener en cuenta que no se permite el valor 0, por lo tanto se debera controlar sin hacer uso de excepciones.

        Si se ingresa el valor 0 en cualquiera de los 2 numeros, se debera mostrar un mensaje indicando que el valor de nro1 o nro2 no es valido.
*/
public class Main {
    public static void main(String[] args) {
        float nro1 = 89f;
        float nro2 = 123f;
        float result = 0;
        float resto = 0;

        //Desarrollo
        if (nro1 == 0 || nro2 == 0) {
            System.out.println("No se puede realizar la división porque algún numero es igual a 0");
        } else {
            if (nro1 >= nro2) {
                result = nro1 / nro2;
                resto = nro1 % nro2;
                System.out.println("Si dividimos "+nro1+" y "+nro2+".\nObtenemos como resultado: "+result+" con resto: "+resto);
            } else {
                result = nro2 / nro1;
                resto = nro2 % nro1;
                System.out.println("Si dividimos "+nro2+" y "+nro1+".\nObtenemos como resultado: "+result+" con resto: "+resto);
            }
        }
    }
}