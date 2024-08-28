package vasquez.app.stream27;

import vasquez.app.stream27.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamDistincUsuarioSum {
    public static void main(String[] args) throws InterruptedException {
        IntStream largos = Stream
                .of("Pato Flores","Paco Jara","Pepa Loayza","Pepe Rojas", "Pepe Garcia","Pato Flores","Pato Flores")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .distinct()
                .mapToInt(u -> u.toString().length())
                .peek(System.out::println);


        //largos.forEach(System.out::println);
        //System.out.println(largos.sum());
        IntSummaryStatistics stats = largos.summaryStatistics();
        System.out.println("max: " + stats.getMax());
        System.out.println("min: " + stats.getMin());
        System.out.println("suma: " + stats.getSum());
        System.out.println("promedio: " + stats.getAverage());
        System.out.println("total: " + stats.getCount());

    }
}
