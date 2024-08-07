package vasquez.app.estructuraDatos24.list;

import vasquez.app.estructuraDatos24.modelo.Alumno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EjemploArrayList { //Obs: Set puede usar todos las iteraciones como el List menos el for clasico.
    public static void main(String[] args) {
        List<Alumno> al = new ArrayList<>();
        System.out.println(al.size());
        System.out.println(al.isEmpty());

        al.add(new Alumno("JD",10));
        al.add(new Alumno("Piero",8));
        al.add(new Alumno("Renzo",2));
        al.add(2, new Alumno("Pepito",5));
        al.add(new Alumno("Joel",0));
        al.add(new Alumno("Tomate",8));
        al.add(new Alumno("Lizu",4));
        al.set(4,new Alumno("Robotin",7));

        System.out.println(al.size());
        System.out.println(al);
        //o se elimina por equals o por indice
        al.remove(new Alumno("Robotin",7));
        //al.remove(3);

        System.out.println(al);
        System.out.println(al.size());

        //me dio flojera usar el contains pero solo busca a un objeto igual respecto a equals(retorna boleano)

        //toArray, convierte el ArrayList en arreglo
        Object [] arr = al.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
