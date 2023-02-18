/*
Ejercicio 3 : Conversor cripto (Ars -> BTC)

                Sabiendo que el precio del bitcoin hoy 18/2/2023 es de 4.749.272,16 hacer un conversor que me permita determinar la cantidad de bitcoins que puedo comprar con X cantidad de pesos Arg.

                Siendo X un valor elegido por el usuario.
*/
public class Main {
    public static void main(String[] args) {
        float BTC = 4749272.16f;
        float cantPesos = 9498544.32f;
        float cantBTC = 0;

        //Realizamos la fórmula:
        cantBTC = cantPesos / BTC;
        System.out.println("Con $"+cantPesos+" de pesos argentinos y con un BTC a $"+BTC+"\nPuedo comprarme "+cantBTC+" BTC");
    }
}