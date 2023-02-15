public class Main {
    public static void main(String[] args) {
        //Declaración Variables
        float numInitial = 180.23f;
        float numDec = 0;
        float numEnt = 0;

        //Desarrollando Ejercicio
        numDec = numInitial % 1;
        numEnt = numInitial - numDec;

        //Imprimir valores en consola
        System.out.println("El numero elegido es: " +numInitial);
        System.out.println("La parte entera del numero es: "+numEnt+ "\nLa parte decimal del numero es: "+numDec);
    }
}