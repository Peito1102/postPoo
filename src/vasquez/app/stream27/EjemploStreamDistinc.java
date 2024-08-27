package vasquez.app.stream27;

import vasquez.app.stream27.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinc {
    public static void main(String[] args) {
        Stream<String> nombres = Stream.of("Pato Flores","Paco Jara","Pepa Loayza","Pepe Rojas"
                        , "Pepe Garcia","Paco Gonzales","Paco Gonzales",
                        "Paco Gonzales","Paco Gonzales")
                .distinct(); //hace que los repetido no esten en el Stream
                nombres.forEach(System.out::println);



    }
}
