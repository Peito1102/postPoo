package vasquez.app.estructuraDatos24;

import java.util.*;

public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {
        String [] peces = {"Corvina","Lenguado","Pejerrey","Robalo","Atún","Lenguado","Pejerrey"};
        Set<String> unicos = new HashSet<>();
        Set<String> repetidos = new HashSet<>();
        for (String p : peces) {
            if (!unicos.add(p)) {
                repetidos.add(p);
            }
        }
        System.out.println("Todos los elementos: " + unicos);
        unicos.removeAll(repetidos);

        System.out.println("Elementos unicos: " + unicos);
        System.out.println("Elementos repetidos: " + repetidos);

    }
}
