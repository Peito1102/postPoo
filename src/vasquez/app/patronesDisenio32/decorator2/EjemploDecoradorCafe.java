package vasquez.app.patronesDisenio32.decorator2;

import vasquez.app.patronesDisenio32.decorator2.decorador.ConChocolateDecorador;
import vasquez.app.patronesDisenio32.decorator2.decorador.ConCremaDecorador;
import vasquez.app.patronesDisenio32.decorator2.decorador.ConLecheDecorador;

public class EjemploDecoradorCafe {
    public static void main(String[] args) {
        Cafe cafe = new Cafe(6f,"Cafe moca");
        ConCremaDecorador conCrema = new ConCremaDecorador(cafe);
        ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
        ConChocolateDecorador conChoco = new ConChocolateDecorador(conLeche);

        System.out.println("El precio del café moca es: " + conChoco.getPrecioBase());
        System.out.println("Los ingredientes: " + conChoco.getIngredientes());
        System.out.println();

        Configurable capuchino = new Cafe(4,"Cafe Capuchino");
        conCrema = new ConCremaDecorador(capuchino);
        conLeche = new ConLecheDecorador(conCrema);
        System.out.println("El precio del café moca es: " + conLeche.getPrecioBase());
        System.out.println("Los ingredientes: " + conLeche.getIngredientes());
        System.out.println();

        Configurable espresso = new Cafe(3,"Cafe Espresso");
        System.out.println("El precio del café moca es: " + espresso.getPrecioBase());
        System.out.println("Los ingredientes: " + espresso.getIngredientes());
    }
}
