package vasquez.app.thc25.ejemplos;

import vasquez.app.thc25.ejemplos.runnable.ImprimirFrases;

public class EjemploSincronizacionThread {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new ImprimirFrases("Hola"," que tal!")).start();
        new Thread(new ImprimirFrases("¿Quien eres "," you?")).start();
        Thread t3 = new Thread(new ImprimirFrases("Muchas Gracias"," amiwito!"));
        t3.start();
        System.out.println(t3.getState());
        Thread.sleep(100);
        System.out.println(t3.getState());
    }

    public synchronized static void imprimirFrases(String frase1, String frase2) throws InterruptedException {
        System.out.print(frase1);
        Thread.sleep(500);
        System.out.println(frase2);
    }
}
