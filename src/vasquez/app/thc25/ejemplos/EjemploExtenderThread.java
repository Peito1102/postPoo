package vasquez.app.thc25.ejemplos;

import vasquez.app.thc25.ejemplos.thread.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new NombreThread("Renzo Vasquez");
        hilo.start();
        //Thread.sleep(100);
        Thread hilo2 = new NombreThread("JD Flores");
        hilo2.start();
        Thread hilo3 = new NombreThread("Pepito Rojas");
        hilo3.start();
        System.out.println(hilo.getState());
    }
}
