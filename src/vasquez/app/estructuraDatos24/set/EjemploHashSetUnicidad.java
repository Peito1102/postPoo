package vasquez.app.estructuraDatos24.set;

import vasquez.app.estructuraDatos24.modelo.Alumno;

import java.util.*;
import java.util.stream.Stream;

public class EjemploHashSetUnicidad { //Obs: Set puede usar todos las iteraciones como el List menos el for clasico.
    public static void main(String[] args) {
        Set<Alumno> sa = new HashSet<>();
        //List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("JD",10));
        sa.add(new Alumno("Piero",8));
        sa.add(new Alumno("Renzo",2));
        sa.add(new Alumno("Pepito",5));
        sa.add(new Alumno("Joel",0));
        sa.add(new Alumno("Tomate",8));
        sa.add(new Alumno("Lizu",4));
        sa.add(new Alumno("Robotin",7));
        sa.add(new Alumno("Robotin",7));

        System.out.println(sa);
        /*
        System.out.println("For clasico");
        for (int i = 0;i < sa.size();i++) {
            Alumno a = sa.get(i);
            System.out.println(a.getNombre());
        }*/

        System.out.println("Iterando con forEach");
        for (Alumno a : sa) {
            System.out.println(a);
        }

        System.out.println("Iterando con while y iterator");
        Iterator<Alumno> it = sa.iterator();
        while (it.hasNext()) {
            Alumno a = it .next();
            System.out.println(a);
        }
        /*
        do {
            Alumno a = it .next();
            System.out.println(a);
        } while (it.hasNext()); */

        System.out.println("Iterando usando Stream forEach");
        sa.forEach(System.out::println);

    }

}
