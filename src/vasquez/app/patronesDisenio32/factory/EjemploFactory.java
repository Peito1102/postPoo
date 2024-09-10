package vasquez.app.patronesDisenio32.factory;

import vasquez.app.patronesDisenio32.factory.producto.PizzaProducto;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = california.ordenarPizza("queso");
        System.out.println("Pepito ordenó la pizza: " + pizza.getNombre());
        System.out.println();

        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("Jotade ordenó la pizza: " + pizza.getNombre());
    }
}
