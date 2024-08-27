package vasquez.app.stream27;

import java.util.stream.Stream;

public class EjemploStreamReduce {
    public static void main(String[] args) {
        Stream<String> nombres = Stream.of("Pato Flores","Paco Jara","Pepa Loayza","Pepe Rojas"
                        , "Pepe Garcia","Paco Gonzales","Paco Gonzales",
                        "Paco Gonzales","Paco Gonzales")
                .distinct(); //hace que los repetido no esten en el Stream

        String resultado = nombres.reduce("Nombre Apellido", (a,b) -> a + " | " + b);
        System.out.println(resultado);



    }
}
