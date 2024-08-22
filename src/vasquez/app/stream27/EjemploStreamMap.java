package vasquez.app.stream27;

import vasquez.app.stream27.models.Usuario;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream
                .of("Pato Flores","Paco Jara","Pepa Loayza","Pepe Rojas")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(System.out::println)
                .map(usuario -> {
                    String nombre = usuario.getNombre().toUpperCase();
                    usuario.setNombre(nombre);
                    return usuario;
                });

        List<Usuario> lista = nombres.collect(Collectors.toList());
        System.out.println();
        lista.forEach(usuario -> System.out.println(usuario));


    }
}
