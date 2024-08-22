package vasquez.app.stream27;

import vasquez.app.stream27.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle2 {
    public static void main(String[] args) {
        Usuario usuario = Stream
                .of("Pato Flores","Paco Jara","Pepa Loayza","Pepe Rojas", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .filter(usu -> usu.getId().equals(3))
                .findFirst().get();

        System.out.println(usuario);

    }
}
