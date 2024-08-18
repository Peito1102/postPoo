package vasquez.app.thc25.ejemploexecuter;

import java.util.concurrent.*;

public class EjemploExecuterFuture2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        //Executors.newFixedThreadPool(n) ejecuta n tareas a la vez
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Callable<String> tarea = () -> {
            System.out.println("Inicio de la tarea... ");
            try {
                System.out.println("Nombre del Thread " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            System.out.println("Finaliza la tarea");
            return "Algun resultado de tarea";
        };

        Callable<Integer> tarea2 = () -> {
            System.out.println("Iniciando tarea 2...");
            TimeUnit.SECONDS.sleep(3);
            return 10;
        };

        Future<String> resultado = executor.submit(tarea);
        Future<String> resultado2 = executor.submit(tarea);
        Future<Integer> resultado3 = executor.submit(tarea2);
        executor.shutdown();
        System.out.println("Continuamos con la ejecución del método main ");

        //System.out.println(resultado.isDone());
        while (!(resultado.isDone() && resultado2.isDone() && resultado3.isDone())) {
            System.out.println(String.format("resultado1: %s - resultado2: %s - resultado3: %s",
                    resultado.isDone() ? "finalizó" : "en proceso",
                    resultado2.isDone() ? "finalizó" : "en proceso",
                    resultado3.isDone() ? "finalizó" : "en proceso"));
            TimeUnit.MILLISECONDS.sleep(1000);
        }

        System.out.println("Obtengamos resultado de la tarea: " + resultado.get());
        System.out.println("Finaliza la tarea: " + resultado.isDone());

        System.out.println("Obtengamos resultado de la tarea: " + resultado2.get());
        System.out.println("Finaliza la tarea: " + resultado2.isDone());

        System.out.println("Obtengamos resultado de la tarea: " + resultado3.get());
        System.out.println("Finaliza la tarea: " + resultado3.isDone());

    }
}
