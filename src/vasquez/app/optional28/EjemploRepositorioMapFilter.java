package vasquez.app.optional28;

import vasquez.app.optional28.models.Computador;
import vasquez.app.optional28.models.Fabricante;
import vasquez.app.optional28.models.Procesador;
import vasquez.app.optional28.repositorio.ComputadorRepositorio;
import vasquez.app.optional28.repositorio.Repositorio;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        String name = repositorio.filtrar("asus rog")
                .map(Computador::getProcesador)
                .map(Procesador::getFabricante)
                .filter(fab -> "amd".equalsIgnoreCase(fab.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido.");

        System.out.println(name);

    }

}
