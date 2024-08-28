package vasquez.app.stream27;

import vasquez.app.stream27.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistincUsuario {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream
                .of("Pato Flores","Paco Jara","Pepa Loayza","Pepe Rojas", "Pepe Garcia","Pato Flores","Pato Flores")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .distinct();

        nombres.forEach(System.out::println);

    }
}
