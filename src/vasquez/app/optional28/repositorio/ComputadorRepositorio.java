package vasquez.app.optional28.repositorio;

import vasquez.app.optional28.models.Computador;
import vasquez.app.optional28.models.Fabricante;
import vasquez.app.optional28.models.Procesador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepositorio implements Repositorio<Computador> {
    private List<Computador> dataSource;

    public ComputadorRepositorio() {
        dataSource = new ArrayList<>();
        Procesador proc = new Procesador("Ryzen 9",new Fabricante("AMD"));
        Computador asus = new Computador("Asus ROG","Strix G512");
        asus.setProcesador(proc);
        dataSource.add(asus);
        dataSource.add(new Computador("MacBook Pro","MVVK2CI"));
    }

    @Override
    public Optional<Computador> filtrar(String nombre) {
        return dataSource.stream().filter(c -> c.getNombre()
                .toLowerCase().contains(nombre.toLowerCase())).findFirst();
        /*for (Computador c : dataSource) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return Optional.of(c);
            }
        }
        return Optional.empty();*/
    }
}
