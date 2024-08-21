package vasquez.app.lambda26;

import vasquez.app.lambda26.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {

        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };

        consumidor.accept(new Date());

        BiConsumer<String,Integer> consumidorBi = (nombre, edad) -> {
            System.out.println(nombre + ", tiene " + edad + " años!");
        };

        consumidorBi.accept("Renzo",22);

        Consumer<String> consumidor2 = System.out::println;
        consumidor2.accept("Hola papi");

        List<String> nombres = Arrays.asList("andres","pepito","JD","joel","raton");
        nombres.forEach(consumidor2);

        Supplier<Usuario> crearUsuario = Usuario::new; //o new Usuario()
        Usuario usuario = crearUsuario.get();


        BiConsumer<Usuario,String> asignarNombre = (persona,nombre) -> {
            persona.setNombre(nombre);
        };

        asignarNombre.accept(usuario,"Leonel");
        System.out.println("Nombre del usuario: " + usuario.getNombre());

        Supplier<String> proveedor = () -> "Hola ppis lambda supplier";

        System.out.println(proveedor.get());

    }
}
