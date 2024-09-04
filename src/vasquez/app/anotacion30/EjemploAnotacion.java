package vasquez.app.anotacion30;

import vasquez.app.anotacion30.models.Producto;
import vasquez.app.anotacion30.procesador.JsonSerializador;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class EjemploAnotacion {
    public static void main(String[] args) {
        Producto p = new Producto();
        p.setFecha(LocalDate.now());
        p.setNombre("mesa central roble");
        p.setPrecio(1000L);


        System.out.println(JsonSerializador.convertirJson(p));
    }
}
