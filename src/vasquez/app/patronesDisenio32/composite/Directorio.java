package vasquez.app.patronesDisenio32.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Directorio extends Componente{
    List<Componente> hijos;

    public Directorio(String nombre) {
        super(nombre);
        this.hijos = new ArrayList<>();
    }

    public Directorio addComponente(Componente c) {
        hijos.add(c);
        return this;
    }

    public void removerComponente(Componente c) {
        hijos.remove(c);
    }

    @Override
    public String mostrar(int nivel) {
        StringBuilder sb = new StringBuilder("\t".repeat(nivel));
        sb.append(nombre).append("/").append("\n");
        for (Componente hijo: hijos) {
            sb.append(hijo.mostrar(nivel+1));
            if (hijo instanceof Archivo) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Directorio that = (Directorio) object;
        return Objects.equals(hijos, that.hijos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hijos);
    }
}
