package vasquez.app.anotacion30;

import vasquez.app.anotacion30.models.Producto;

import java.time.LocalDate;

public class EjemploAnotacion {
    public static void main(String[] args) {
        Producto p = new Producto();
        p.setFecha(LocalDate.now());
        p.setNombre("mesa central roble");
        p.setPrecio(1000L);

        

    }
}
