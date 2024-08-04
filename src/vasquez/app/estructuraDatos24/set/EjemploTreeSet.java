package vasquez.app.estructuraDatos24.set;

import java.util.*;

public class EjemploTreeSet {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<>(Comparator.reverseOrder());
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres");
        ts.add("cinco");
        ts.add("seis");
        ts.add("siete");

        System.out.println(ts);

        Set<Integer> numeros = new TreeSet<>(Comparator.reverseOrder());
        numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(4);
        numeros.add(3);
        System.out.println(numeros);
    }
}
