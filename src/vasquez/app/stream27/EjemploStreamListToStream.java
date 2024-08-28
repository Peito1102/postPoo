package vasquez.app.stream27;

import vasquez.app.stream27.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamListToStream {
    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Andres","Guzman"));
        lista.add(new Usuario("Pepito","Rojas"));
        lista.add(new Usuario("JD","Flores"));
        lista.add(new Usuario("Chinin","Salazar"));
        lista.add(new Usuario("Joel","Mendieta"));
        lista.add(new Usuario("Piero","Pelaez"));
        lista.add(new Usuario("Piero","Chavez"));

        Stream<String> nombres = lista.stream().map(u -> u.getNombre().toUpperCase()
                .concat(" ")
                .concat(u.getApellido().toUpperCase()))
                .flatMap(nombre -> {
                    if (nombre.contains("piero".toUpperCase())) {
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .map(String::toLowerCase)
                .peek(System.out::println);

        System.out.println(nombres.count());

    }

}
