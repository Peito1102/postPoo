package vasquez.app.thc25.ejemploexecuter;

import java.util.concurrent.*;

public class EjemploExecuterFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        //Executors.newSingleThreadExecutor() solo mete un tarea a ejecucion, ejecuta 1 x 1
        ExecutorService executor = Executors.newSingleThreadExecutor();
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
        Future<?> resultado = executor.submit(tarea);
        executor.shutdown();
        System.out.println("Continuamos con la ejecución del método main ");

        //System.out.println(resultado.isDone());
        while (!resultado.isDone()) {
            System.out.println("Ejecutando tarea....");
            TimeUnit.MILLISECONDS.sleep(1500);
        }


        System.out.println("Obtengamos resultado de la tarea: " + resultado.get());
        System.out.println("Finaliza la tarea: " + resultado.isDone());

    }
}
