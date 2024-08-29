package vasquez.app.optional28;

import vasquez.app.optional28.models.Computador;
import vasquez.app.optional28.repositorio.ComputadorRepositorio;
import vasquez.app.optional28.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        repositorio.filtrar("asus rog").ifPresentOrElse(System.out::println,
                () -> System.out.println("No se encontró."));
        //Optional<Computador> pc = repositorio.filtrar("asus rog");

        /*if (pc.isPresent()) {
            System.out.println(pc.get().toString());
        } else System.out.println("No se encontró."); */

    }

}
