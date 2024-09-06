package vasquez.app.patronesDisenio.factory;

import vasquez.app.patronesDisenio.factory.producto.PizzaNewYorkItaliana;
import vasquez.app.patronesDisenio.factory.producto.PizzaNewYorkPepperoni;
import vasquez.app.patronesDisenio.factory.producto.PizzaNewYorkVegetariano;
import vasquez.app.patronesDisenio.factory.producto.PizzaProducto;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{

    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "vegetariana" -> new PizzaNewYorkVegetariano();
            case "pepperoni" -> new PizzaNewYorkPepperoni();
            case "italiana" -> new PizzaNewYorkItaliana();
            default -> null;
        };
    }
}
