package vasquez.app.estructuraDatos24.set;

import java.util.*;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        hs.add("seis");
        hs.add("siete");
        System.out.println(hs);
        boolean a = hs.add("uno");
        System.out.println(a);

        List<String> lista = new ArrayList<>(hs);
        Collections.sort(lista);
        System.out.println(lista);
        Collections.reverse(lista);
        System.out.println(lista);

    }
}
