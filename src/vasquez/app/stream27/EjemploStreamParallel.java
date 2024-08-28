package vasquez.app.stream27;

import vasquez.app.stream27.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class EjemploStreamParallel {
    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Andres","Guzman"));
        lista.add(new Usuario("Pepito","Rojas"));
        lista.add(new Usuario("JD","Flores"));
        lista.add(new Usuario("Chinin","Salazar"));
        lista.add(new Usuario("Joel","Mendieta"));
        lista.add(new Usuario("Piero","Pelaez"));
        lista.add(new Usuario("Piero","Chavez"));

        long t1 = System.currentTimeMillis();
        String resultado = lista.stream()
                .parallel()
                .map(u -> u.toString().toUpperCase())
                .peek(n -> {
                    System.out.println("Nombre Thread: " + Thread.currentThread().getName() +  " - " + n);
                })
                .flatMap(nombre -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (nombre.contains("piero".toUpperCase())) {
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .findAny().orElse("");

        long t2 = System.currentTimeMillis();

        System.out.println("Tiempo total: " + (t2- t1));
        System.out.println(resultado);

    }

}
