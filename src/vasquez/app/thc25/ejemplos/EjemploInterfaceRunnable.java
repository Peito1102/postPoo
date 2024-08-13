package vasquez.app.thc25.ejemplos;

import vasquez.app.thc25.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnable {
    public static void main(String[] args) {
        new Thread(new ViajeTarea("Macchu Picchu")).start();
        new Thread(new ViajeTarea("Manglares de Tumbes")).start();
        new Thread(new ViajeTarea("Oxapampa")).start();

    }
}
