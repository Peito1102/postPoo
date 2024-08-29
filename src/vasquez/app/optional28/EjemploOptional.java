package vasquez.app.optional28;

import java.util.Optional;

public class EjemploOptional {
    public static void main(String[] args) {
        String nombre = "Renzo";
        Optional<String> opt = Optional.of(nombre);
        System.out.println(opt);
        System.out.println(opt.isPresent());
        if (opt.isPresent()) {
            System.out.println("Hola " + opt.get());
        }
        System.out.println(opt.isEmpty());

        opt.ifPresent(s -> System.out.println("Hola " + s));

        nombre = null;
        //opt = Optional.of(nombre); // botara error porque no se puede usar null en of()
        
        opt = Optional.ofNullable(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());
        System.out.println(opt.isEmpty());
        opt.ifPresentOrElse(val -> System.out.println("Hola " + val), () -> System.out.println("No hay valor."));

        if (opt.isPresent()) {
            System.out.println("Hola" + opt);
        } else System.out.println("No está presente");

        Optional<String> optEmpty = Optional.empty();
        System.out.println("optEmpty = " + optEmpty);
        System.out.println(optEmpty.isPresent());
    }
}
