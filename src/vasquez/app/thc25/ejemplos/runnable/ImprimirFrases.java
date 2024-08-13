package vasquez.app.thc25.ejemplos.runnable;

import static vasquez.app.thc25.ejemplos.EjemploSincronizacionThread.imprimirFrases;

public class ImprimirFrases implements Runnable {
    private String frase1, frase2;

    public ImprimirFrases(String frase1, String frase2) {
        this.frase1 = frase1;
        this.frase2 = frase2;
    }

    @Override
    public void run() {
        try {
            imprimirFrases(frase1,frase2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
