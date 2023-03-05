import Utils.Persona;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Creando los 5 objetos
        Persona people1 = new Persona("Lautaro", "Santillan");
        Persona people2 = new Persona("Nazareno", "Perez");
        Persona people3 = new Persona("Tomas", "Caceres");
        Persona people4 = new Persona("Ramiro","Pecora");
        Persona people5 = new Persona("Nicolas", "Sosa");

        //Metiendo los objetos a una lista
        List<Persona> personas = new ArrayList<Persona>();
        personas.add(people1);
        personas.add(people2);
        personas.add(people3);
        personas.add(people4);
        personas.add(people5);

        //Se verifica que se hayan agregado correctamente todos los objetos a la lista y enumerarlos
        /*System.out.println("Cantidad de elementos para iterar: " + listaPersonas.size());
        for (Persona personas : listaPersonas){
            System.out.println("Persona: " + personas);
        }*/

        //Ordenado por nombre
        Collections.sort(personas);
        for (Persona elemento:personas){
            System.out.println(elemento);
        }
        System.out.println("-----------------------------------------------------------------");

        //Ordenado por apellido
        Collections.sort(personas, Comparator.comparing(Persona::getApellido));
        for (Persona elemento:personas){
            System.out.println(elemento);
        }
        System.out.println("-----------------------------------------------------------------");

        //Ordenado inversamente por apellido
        Collections.sort(personas, (Persona a, Persona b) -> b.getApellido().compareTo(a.getApellido()));
        for (Persona elemento:personas){
            System.out.println(elemento);
        }
    }
}