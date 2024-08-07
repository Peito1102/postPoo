package vasquez.app.estructuraDatos24.map;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {
        Map<String,String> persona = new HashMap<>();
        //si la llave se repite, se reemplaza por el ultimo agregado repetido
        persona.put(null,"123");
        persona.put(null,"1234");
        persona.put("nombre","John");
        //si se repito el valor, no importa
        persona.put("apellido","Doe");
        persona.put("apellidoPaterno","Doe");
        persona.put("email","john.doe@email.com");
        persona.put("edad","30");

        System.out.println("persona = " + persona);

        //se obtiene los valores por sus llaves
        String nombre = persona.get("nombre");
        System.out.println("nombre = " + nombre);

    }
}
