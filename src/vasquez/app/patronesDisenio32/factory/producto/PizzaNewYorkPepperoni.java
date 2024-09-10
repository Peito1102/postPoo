package vasquez.app.patronesDisenio32.factory.producto;

public class PizzaNewYorkPepperoni extends PizzaProducto {
    public PizzaNewYorkPepperoni() {
        super();
        nombre = "Pizza Pepperoni New York";
        masa = "Masa delgada a la piedra";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Extra pepperoni");
        ingredientes.add("Aceitunas");
    }
    @Override
    public void cocinar() {
        System.out.println("Cocinando por 48 min. a 90°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triángulos");
    }
}
