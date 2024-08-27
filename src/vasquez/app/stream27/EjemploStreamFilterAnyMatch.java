package vasquez.app.stream27;

import vasquez.app.stream27.models.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamFilterAnyMatch {
    public static void main(String[] args) {
        boolean existe = Stream
                .of("Pato Flores","Paco Jara","Pepa Loayza","Pepe Rojas", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(System.out::println)
                .anyMatch(usu -> usu.getId().equals(1));

        System.out.println(existe);

        /*List<Usuario> lista = Arrays.asList(new Usuario("Pato", "Flores")
                , new Usuario("Paco","Jara")
                , new Usuario("Pepa","Loayza")
                , new Usuario("Pepe","Rojas")
                , new Usuario("Pepe","Garcia"));

        boolean resultado = false;
        for (Usuario u : lista) {
            if (u.getId().equals(3)) {
                resultado = true;
                break;
            }
        }

        System.out.println(resultado);*/
    }
}
