package vasquez.app.patronesDisenio32.composite;

abstract public class Componente {
    protected String nombre;

    public Componente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    abstract public String mostrar(int nivel);
}
