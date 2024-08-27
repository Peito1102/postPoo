package vasquez.app.stream27;

import vasquez.app.stream27.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterCount {
    public static void main(String[] args) {
        long count = Stream
                .of("Pato Flores","Paco Jara","Pepa Loayza","Pepe Rojas", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(System.out::println)
                .count();

        System.out.println(count);

    }
}
