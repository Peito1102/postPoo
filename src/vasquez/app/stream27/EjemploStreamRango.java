package vasquez.app.stream27;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamRango {
    public static void main(String[] args) {
        IntStream num = IntStream.range(1,6).peek(System.out::println);

        //int resultado = num.reduce(0, Integer::sum);
        //int resultado = num.sum();
        //System.out.println(resultado);

        IntSummaryStatistics stats = num.summaryStatistics();
        System.out.println("max: " + stats.getMax());
        System.out.println("min: " + stats.getMin());
        System.out.println("suma: " + stats.getSum());
        System.out.println("promedio: " + stats.getAverage());
        System.out.println("total: " + stats.getCount());

        //obs: solo se puede usar una funcion terminal por Stream
    }
}
