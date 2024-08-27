package vasquez.app.stream27;

import vasquez.app.stream27.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {
    public static void main(String[] args) {
        long count = Stream
                .of("Pato Flores","Paco Jara","","Pepe Rojas", "")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();

        System.out.println(count);

    }
}
