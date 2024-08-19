package vasquez.app.thc25.ejemploexecuter;

import java.util.concurrent.*;

public class EjemploScheduledExecuterServicePeriodo {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        System.out.println("Alguna tarea en el main...");

        CountDownLatch lock = new CountDownLatch(5);

        Future<?> future = executor.scheduleAtFixedRate(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                lock.countDown();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hola mundo tarea...");
        },1000, 2000,TimeUnit.MILLISECONDS);
        lock.await();
        future.cancel(true);

        System.out.println("Alguna otra tarea en el main...");
        executor.shutdown();
    }
}
