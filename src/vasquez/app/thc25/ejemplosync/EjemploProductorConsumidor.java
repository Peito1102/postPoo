package vasquez.app.thc25.ejemplosync;

import vasquez.app.thc25.ejemplosync.runnable.Consumidor;
import vasquez.app.thc25.ejemplosync.runnable.Panadero;

public class EjemploProductorConsumidor {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();
    }
}
