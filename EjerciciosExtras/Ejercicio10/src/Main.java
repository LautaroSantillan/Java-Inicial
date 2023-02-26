/*
Ejercicio 10 - matematicas.

        Se solicita crear un programa que realice lo siguiente.

        1 - Se deben cargar 2 arreglos manualmente numericos, ambos arreglos deben tener la misma longitud y sera determinada por el usuario.

        2 - Se deberá mostrar la sumatoria de todos los elementos contenidos en cada arreglo.

        3 - Se deberá mostrar que arreglo contiene el mayor y el menor numero de los 2
*/
public class Main {
    public static void main(String[] args) {
        //Arreglos y Variables
        int[] firstArray = {500, 300, 900, 700, 100};
        int[] secondArray = {400, 600, 800, 1000, 200};
        int suma1 = 0;
        int suma2 = 0;
        int highNumber = 0;
        int lowerNumber = 0;
        int highNumber2 = 0;
        int lowerNumber2 = 0;
        int min = 0;

        //Desarrollo de Sumatoria
        for (int i=0; i<5; i++){
            suma1+=firstArray[i];
        }
        System.out.println("La sumatoria del primer array es de: "+suma1);

        for (int j=0; j<5; j++){
            suma2+=secondArray[j];
        }
        System.out.println("La sumatoria del segundo array es de: "+suma2);

        for(int k=0; k<5; k++){
            if (highNumber<firstArray[k]){
                highNumber=firstArray[k];
            }
        }

        for(int l=0; l<5; l++){
            if (highNumber2<secondArray[l]){
                highNumber2=secondArray[l];
            }
        }

        if (highNumber>highNumber2){
            System.out.println("\nEl número más alto es: "+highNumber+", que corresponde al primer array");
        } else {
            System.out.println("\nEl número más alto es: "+highNumber2+", que corresponde al segundo array");
        }

        for(int m=0; m<5; m++){
            min=firstArray[0];
            if (min>firstArray[m]){
                lowerNumber=firstArray[m];
            }
        }

        for(int n=0; n<5; n++){
            min=secondArray[0];
            if (min>secondArray[n]){
                lowerNumber2=secondArray[n];
            }
        }

        if (lowerNumber<lowerNumber2){
            System.out.println("\nEl número más bajo es: "+lowerNumber+", que corresponde al primer array");
        } else {
            System.out.println("\nEl número más bajo es: "+lowerNumber2+", que corresponde al segundo array");
        }
    }
}