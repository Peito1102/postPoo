package vasquez.app.estructuraDatos24.set;

import vasquez.app.estructuraDatos24.modelo.Alumno;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {
        Set<Alumno> sa = new HashSet<>();
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
    }

}
