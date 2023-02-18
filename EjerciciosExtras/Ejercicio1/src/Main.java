/*Ejercicio 1 : Radio

        Calculuar el radio de un circulo de diametro N, donde el diametro sera determinada por el usuario.

        Nota : no es necesario el ingreso por teclado, puede ser un valor elegido por uds.

        Formula -> R = D/2, siendo R = radio y D = diametro
*/
public class Main {
    public static void main(String[] args) {
        float N = 189.18f;
        float R = 0;

        //Realizamos la fórmula
        R = N/2;
        System.out.println("El radio de es de: "+R);
    }
}