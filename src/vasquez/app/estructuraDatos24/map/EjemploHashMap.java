package vasquez.app.estructuraDatos24.map;

import java.util.*;

public class EjemploHashMap extends Thread{
    public static void main(String[] args) {
        HashMap<String,Object> persona = new HashMap<>();
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

        Map<String,String> direccion = new HashMap<>();
        direccion.put("pais","USA");
        direccion.put("estado","California");
        direccion.put("ciudad","Santa Barbara");
        direccion.put("calle","One Street");
        direccion.put("numero","120");

        persona.put("direccion",direccion);

        //se obtiene los valores por sus llaves
        String nombre = (String) persona.get("nombre");
        System.out.println("nombre = " + nombre);

        Map<String,String> direccionPersona = (Map<String,String>)persona.get("direccion");
        String pais = direccionPersona.get("pais");
        String ciudad = direccionPersona.get("ciudad");
        String barrio = direccionPersona.getOrDefault("barrio","La plasha");
        System.out.println("El pais de " + nombre + " es: " + pais);
        System.out.println("La ciudad de " + nombre + " es: " + ciudad);
        System.out.println("El barrio de " + nombre + " es: " + barrio);



        //retorna boleano cuando se inserta tanto la llave y el valor en el remove(eliminar)
        //boolean b = persona.remove("apellidoPaterno","Doe");
        //retorna el valor de la llave al usar el remove(eliminar)
        String valor = (String) persona.remove("apellidoPaterno");
        System.out.println("valor = " + valor);

        //busca esa llave y retorna un boolean
        boolean b2 = persona.containsKey("apellidoPaterno");
        System.out.println("b2 = " + b2);

        //busca ese valor y retorna un boolean
        b2 = persona.containsValue("Roe");
        System.out.println("b2 = " + b2);

        Collection<Object> valores = persona.values();
        valores.forEach(System.out::println);

        System.out.println(persona);

        Set<String> llaves = persona.keySet();
        llaves.forEach(System.out::println);

        System.out.println("3 formas de mostrar llave y valor.");
        System.out.println("Forma usando el Map EntrySet");
        for (Map.Entry<String, Object> par: persona.entrySet()) {
            Object va = par.getValue();
            if (va instanceof Map) {
                Map<String,String> direccionMap = (Map<String,String>)va;
                for (Map.Entry<String, String> parDir: direccionMap.entrySet()) {
                    System.out.println(parDir.getKey() + " => "+ parDir.getValue());
                }

            } else {
                System.out.println(par.getKey() + " => " + va);
            }
        }

        System.out.println("Forma usando el Set");
        for (Object s : persona.keySet()){
            Object v = persona.get(s);
            if (v instanceof Map) {
                String nom = (String) persona.get("nombre");
                Map<String,String> direccionMap = (Map<String,String>)v;
                System.out.println("El pais de "+  nom + ": " + direccionMap.get("pais"));
                System.out.println("El estado de "+  nom + ": " + direccionMap.get("estado"));
                System.out.println("El ciudad de "+  nom + ": " + direccionMap.get("ciudad"));

            } else {
                System.out.println(s + " => " + persona.get(s));
            }
        }

        System.out.println("Forma lambda");
        persona.forEach((llave,v) -> {
            System.out.println(llave + " => " + v);
        });

        System.out.println("total : " + persona.size());
        System.out.println("contiene elementos? : " + !persona.isEmpty());

        //pones la llave y su valor a reemplazar
        persona.replace("nombre","Renzo");
        System.out.println(persona);

    }
}
