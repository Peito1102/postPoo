package vasquez.app.stream27;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class EjemploStreamInfinitoGenerate {
    public static void main(String[] args) {
        Stream.generate(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Hola mundo!";
        }).limit(2).forEach(System.out::println);


    }
}
