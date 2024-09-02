package vasquez.app.date_time29;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class EjemploZoneDateTime {
    public static void main(String[] args) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        LocalDateTime fechaLocal = LocalDateTime.parse("2025/10/11 11:30",
                f);
        //ZoneId newYork = ZoneId.of("America/New_York");
        //ZonedDateTime zonaNy = ZonedDateTime.of(fechaLocal, ZoneOffset.of("-04:00")); //forma2
        ZonedDateTime zonaNy = fechaLocal.atZone(ZoneOffset.of("-04:00"));

        //ZonedDateTime zonaNy = ZonedDateTime.of(fechaLocal, newYork); //forma1
        System.out.println(zonaNy);

        ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime zonaMadrid = zonaNy.withZoneSameInstant(madrid).plusHours(8);
        System.out.println(zonaMadrid);
        System.out.println();

        ZonedDateTime prueba = ZonedDateTime.now(ZoneId.of("Europe/Madrid"));
        System.out.println(prueba);
        System.out.println();

        System.out.println("Detalles del viaje a españa:");
        System.out.println("Partida NY: " + f.format(zonaNy));
        System.out.println("Llegada Madrid: " + f.format(zonaMadrid));

        ZoneId.getAvailableZoneIds().forEach(System.out::println);
    }
}
