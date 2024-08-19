package vasquez.app.thc25.ejemploexecuter;

import vasquez.app.thc25.ejemplosync.Panaderia;
import vasquez.app.thc25.ejemplosync.runnable.Consumidor;
import vasquez.app.thc25.ejemplosync.runnable.Panadero;

import java.util.concurrent.*;

public class EjemploExecuterProductorConsumidor {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        //Executors.newFixedThreadPool(n) ejecuta n tareas a la vez
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        System.out.println("Tamaño del pool: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());

        Panaderia p = new Panaderia();
        Runnable productor = new Panadero(p);
        Runnable consumidor = new Consumidor(p);
        Future<?> futuro1 = executor.submit(productor);
        Future<?> futuro2 = executor.submit(consumidor);

        //tareas en el pool
        System.out.println("Tamaño del pool: " + executor.getPoolSize());
        //tareas que estan en cola
        System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());

        executor.shutdown();
        System.out.println("Continuamos con la ejecución del método main ");


    }
}
