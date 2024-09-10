package vasquez.app.patronesDisenio32.factory;

import vasquez.app.patronesDisenio32.factory.producto.PizzaNewYorkItaliana;
import vasquez.app.patronesDisenio32.factory.producto.PizzaNewYorkPepperoni;
import vasquez.app.patronesDisenio32.factory.producto.PizzaNewYorkVegetariano;
import vasquez.app.patronesDisenio32.factory.producto.PizzaProducto;

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
