package vasquez.app.date_time29;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EjemploLocalTime {
    public static void main(String[] args) {
        LocalTime ahora = LocalTime.now();
        System.out.println(ahora);
        System.out.println(ahora.getHour());
        System.out.println(ahora.getMinute());
        System.out.println(ahora.getSecond());
        System.out.println();

        LocalTime seisConTreinta = LocalTime.of(6,30);
        System.out.println(seisConTreinta);

        seisConTreinta = LocalTime.parse("06:30");
        System.out.println(seisConTreinta);

        LocalTime sieteConTreinta = LocalTime.of(6,30).plus(1, ChronoUnit.HOURS);
        System.out.println(sieteConTreinta);

        boolean esAnterior = LocalTime.of(6,30).isBefore(LocalTime.parse("07:30"));
        System.out.println(esAnterior);

        LocalTime prueba = LocalTime.now().minusHours(4);
        System.out.println(prueba);

        //HH es para 24 horas y hh es para pm y am(si es 23 horas, mostrara 11, si pones "a" muestra pm y am)
        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String ahoraFormateado = seisConTreinta.format(df);
        System.out.println(ahoraFormateado);

        ahoraFormateado = df.format(ahora);
        System.out.println(ahoraFormateado);

        LocalTime max = LocalTime.MAX;
        LocalTime min = LocalTime.MIN;
        System.out.println(max);
        System.out.println(min);

    }
}
