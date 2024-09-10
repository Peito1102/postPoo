package vasquez.app.patronesDisenio32.observer.ejemplos;

import vasquez.app.patronesDisenio32.observer.Corporacion;

public class EjemploObserver {
    public static void main(String[] args) {
        Corporacion google = new Corporacion("Google",1000);
        google.addObserver((observable,obj) -> {
            System.out.println("John: " + observable);
        });

        google.addObserver((observable,obj) -> {
            System.out.println("Andres: " + observable);
        });

        google.addObserver((observable,obj) -> {
            System.out.println("Mary: " + observable);
        });

        google.modificarPrecio(2000);
    }
}
