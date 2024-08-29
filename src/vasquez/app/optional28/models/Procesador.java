package vasquez.app.optional28.models;


public class Procesador {
    private String nombre;
    private Fabricante fabricante;

    public Procesador(String nombre, Fabricante fabricante) {
        this.nombre = nombre;
        this.fabricante = fabricante;
    }

    public Procesador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
}
