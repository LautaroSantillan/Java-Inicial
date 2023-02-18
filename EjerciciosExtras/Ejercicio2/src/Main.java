/*
Ejercicio 2 : Area

        Calcular el area de un cuadrado de ancho N y largo M, donde N y M seran definidos a eleccion.

        Formula -> A = N * M , siendo A = Area, N ancho y M largo.
*/
public class Main {
    public static void main(String[] args) {
        float N = 55.2f;
        float M = 21.5f;
        float A = 0;

        //Realizamos la fórmula:
        A = N * M;
        System.out.println("El área del cuadrado con "+N+" de ancho y "+M+" de largo es de: "+A);
    }
}