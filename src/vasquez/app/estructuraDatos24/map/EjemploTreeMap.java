package vasquez.app.estructuraDatos24.map;

import java.util.*;

public class EjemploTreeMap {
    public static void main(String[] args) {
        //Map<String,Object> persona = new TreeMap<>(); //sin nada se ordena por defecto
        //Map<String,Object> persona = new TreeMap<>((a,b) -> a.compareTo(b)); //forma1
        //Map<String,Object> persona = new TreeMap<>((a,b) -> b.compareTo(a)); //reverso forma1
        //Map<String,Object> persona = new TreeMap<>(Comparator.reverseOrder()); //reverso forma2
        //Map<String,Object> persona = new TreeMap<>(Comparator.comparing(String::length)); //forma3
        Map<String,Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed()); //reverso forma3

        //no puede haber null en llaves
        persona.put("nombre","John");
        //si se repito el valor, no importa
        persona.put("apellido","Doe");
        persona.put("apellidoPaterno","Doe");
        persona.put("email","john.doe@email.com");
        persona.put("edad","30");

        System.out.println("persona = " + persona);

        Map<String,String> direccion = new HashMap<>();
        direccion.put("pais","USA");
        direccion.put("estado","California");
        direccion.put("ciudad","Santa Barbara");
        direccion.put("calle","One Street");
        direccion.put("numero","120");

        persona.put("direccion",direccion);



    }
}
