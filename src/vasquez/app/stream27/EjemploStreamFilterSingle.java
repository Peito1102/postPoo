package vasquez.app.stream27;

import vasquez.app.stream27.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream
                .of("Pato Flores","Paco Jara","Pepa Loayza","Pepe Rojas", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .filter(usuario -> usuario.getNombre().equals("Pepe"))
                .peek(System.out::println);

        Optional<Usuario> usuario = nombres.findFirst();
        System.out.println();
        //System.out.println(usuario.orElse(new Usuario("Renzo","Vasquez")).getNombre());
        //lo mismo que orElse pero cambia de parametro por un lambda
        //System.out.println(usuario.orElseGet(() -> new Usuario("Renzo","Vasquez")).getNombre());
        if (usuario.isPresent()) {
            System.out.println(usuario.get().getNombre());
        } else System.out.println("No se encontro el objeto!");

        //usando el get del Optional se obtiene el valor
        //System.out.println(usuario.get());

    }
}
