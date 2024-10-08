package vasquez.app.estructuraDatos24.modelo;

import java.util.Comparator;
import java.util.Objects;

public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private Integer nota;

    public Alumno(){
    }

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "{nombre='" + nombre + '\'' +
                ", nota=" + nota + "}";
    }

    @Override
    public int compareTo(Alumno o) {
        /*if (this.nombre == null) {
            return 0;
        }
        return this.nombre.compareTo(o.getNombre());*/
        /*
        if (this.nota == o.getNota()) {
            return 0;
        }
        if (this.nota > o.getNota()) {
            return 1;
        } else return -1;

         */
        if (o.getNota() == null) {
            return 0;
        }
        return this.nota.compareTo(o.getNota());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) && Objects.equals(nota, alumno.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota);
    }
}
