package vasquez.app.date_time29;

import java.time.Duration;
import java.time.LocalDateTime;

public class EjemploDuration {
    public static void main(String[] args) {
        LocalDateTime fecha1 = LocalDateTime.now();
        //fecha1 = fecha1.withMonth(10);
        LocalDateTime fecha2 = LocalDateTime.now().plusHours(3).plusMinutes(10).plusDays(1);
        Duration lapsus = Duration.between(fecha1,fecha2);
        System.out.println(lapsus);
        System.out.println(lapsus.getSeconds());
        System.out.println(lapsus.toHours());

    }
}
