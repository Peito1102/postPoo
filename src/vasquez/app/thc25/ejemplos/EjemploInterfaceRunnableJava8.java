package vasquez.app.thc25.ejemplos;

public class EjemploInterfaceRunnableJava8 {
    public static void main(String[] args) throws InterruptedException {
        Thread main = Thread.currentThread();
        Runnable viaje = () -> {
                for (int i = 0; i < 10;i++) {
                    System.out.println(i + " - " + Thread.currentThread().getName());
                    try {
                        Thread.sleep((long)(Math.random() * 1000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                System.out.println("Finalmente me voy de viaje a: " + Thread.currentThread().getName());
                System.out.println(main.getState());
            };

        Thread v1 = new Thread(viaje,"Macchu Picchu");
        Thread v2 = new Thread(viaje,"Manglares de Tumbes");
        Thread v3 = new Thread(viaje,"Oxapampa");

        v1.start();
        v2.start();
        v3.start();
        v1.join();
        v2.join();
        v3.join();
        //Thread.sleep(9000);

        System.out.println("Continuando con la ejecución del método main: " + main.getName());

    }
}
