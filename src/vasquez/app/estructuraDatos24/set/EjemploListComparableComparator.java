package vasquez.app.estructuraDatos24.set;

import vasquez.app.estructuraDatos24.modelo.Alumno;

import java.util.*;

public class EjemploListComparableComparator { //Obs: Set puede usar todos las iteraciones como el List menos el for clasico.
    public static void main(String[] args) {
        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("JD",10));
        sa.add(new Alumno("Piero",8));
        sa.add(new Alumno("Renzo",2));
        sa.add(new Alumno("Pepito",5));
        sa.add(new Alumno("Joel",0));
        sa.add(new Alumno("Tomate",8));
        sa.add(new Alumno("Lizu",4));
        sa.add(new Alumno("Robotin",7));
        sa.add(new Alumno("Robotin",7));
        System.out.println();
        //3 formas de usar comparator
        Collections.sort(sa,(a,b) -> a.getNombre().compareTo(b.getNombre()));
        //sa.sort((a,b) -> a.getNombre().compareTo(b.getNombre()));
        sa.sort(Comparator.comparing(Alumno::getNombre).reversed());
        //el reversed lo invierte
        //sa.sort(Comparator.comparing(Alumno::getNombre).reversed());

        System.out.println("Iterando usando Stream forEach");
        sa.forEach(System.out::println);

    }

}
