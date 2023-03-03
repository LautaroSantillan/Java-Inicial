import Utils.Persona;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creando los 5 objetos
        Persona people1 = new Persona("Lautaro", "Santillan");
        Persona people2 = new Persona("Nazareno", "Perez");
        Persona people3 = new Persona("Tomas", "Caceres");
        Persona people4 = new Persona("Ramiro","Pecora");
        Persona people5 = new Persona("Nicolas", "Sosa");

        //Metiendo los objetos a una lista
        List<Persona> listaPersonas = new ArrayList<Persona>();
        listaPersonas.add(people1);
        listaPersonas.add(people2);
        listaPersonas.add(people3);
        listaPersonas.add(people4);
        listaPersonas.add(people5);

        //Se verifica que se hayan agregado correctamente todos los objetos a la lista y enumerarlos
        System.out.println("Cantidad de elementos para iterar: " + listaPersonas.size());
        for (Persona personas : listaPersonas){
            System.out.println("Persona: " + personas);
        }

    }
}