package vasquez.app.manejoArchivos33;

import vasquez.app.manejoArchivos33.servicio.ArchivoServicio;

public class EjemploLeerArchivo {
    public static void main(String[] args) {
        ArchivoServicio servicio = new ArchivoServicio();
        String nombreArchivo = "C:\\pruebita\\Java\\archivo\\java.txt";
        System.out.println(servicio.leerArchivo2(nombreArchivo));
    }
}
