package vasquez.app.optional28.repositorio;

import vasquez.app.optional28.models.Computador;

import java.util.Optional;

public interface Repositorio<T> {
    Optional<Computador> filtrar(String nombre);

}
