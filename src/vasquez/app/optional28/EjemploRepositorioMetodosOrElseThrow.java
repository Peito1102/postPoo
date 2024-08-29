package vasquez.app.optional28;

import vasquez.app.optional28.models.Computador;
import vasquez.app.optional28.repositorio.ComputadorRepositorio;
import vasquez.app.optional28.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorioMetodosOrElseThrow {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        Computador pc = repositorio.filtrar("asus rog").orElseThrow(IllegalStateException::new);
        System.out.println(pc);
        String archivo = "documento.pdf";
        String extension = Optional.ofNullable(archivo)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".")+1))
                .orElseThrow();

        System.out.println(extension);

    }


}
