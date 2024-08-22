package vasquez.app.stream27;

import vasquez.app.stream27.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilter {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream
                .of("Pato Flores","Paco Jara","Pepa Loayza","Pepe Rojas", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .filter(usuario -> usuario.getNombre().equals("Pepe"))
                .peek(System.out::println);

        List<Usuario> lista = nombres.collect(Collectors.toList());
        System.out.println();
        lista.forEach(usuario -> System.out.println(usuario));

    }
}
