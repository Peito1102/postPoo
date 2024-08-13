package vasquez.app.thc25.ejemplos.thread;

public class NombreThread extends Thread {
    public NombreThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Se inicia el método run del hilo: " + getName());

        for (int i = 0; i < 10;i++) {
            System.out.println(getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Finaliza el hilo.");
    }
}
