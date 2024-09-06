package vasquez.app.patronesDisenio.factory;

import vasquez.app.patronesDisenio.factory.producto.PizzaCaliforniaPepperoni;
import vasquez.app.patronesDisenio.factory.producto.PizzaCaliforniaQueso;
import vasquez.app.patronesDisenio.factory.producto.PizzaCaliforniaVegetariana;
import vasquez.app.patronesDisenio.factory.producto.PizzaProducto;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory {

    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "queso" -> new PizzaCaliforniaQueso();
            case "pepperoni" -> new PizzaCaliforniaPepperoni();
            case "vegetariana" -> new PizzaCaliforniaVegetariana();
            default -> null;
        };
    }
}
