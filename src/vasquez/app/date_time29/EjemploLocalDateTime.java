package vasquez.app.date_time29;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime fechaTiempo = LocalDateTime.now();
        System.out.println("fechaTiempo = " + fechaTiempo);

        fechaTiempo = LocalDateTime.of(2024, Month.AUGUST,24,22,10,30);
        System.out.println("fechaTiempo = " + fechaTiempo);

        fechaTiempo = LocalDateTime.parse("2024-08-24T22:10:30");
        System.out.println("fechaTiempo = " + fechaTiempo);

        LocalDateTime fechaTiempo2 = fechaTiempo.plusDays(1);
        System.out.println("fechaTiempo2 = " + fechaTiempo2);
        System.out.println(fechaTiempo);

        Month mes = fechaTiempo.getMonth();
        System.out.println("mes = " + mes);

        int dia = fechaTiempo.getDayOfMonth();
        System.out.println("dia = " + dia);

        int anio = fechaTiempo.getYear();
        System.out.println("anio = " + anio);

        String formato = fechaTiempo.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("formato = " + formato);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a");
        String formato2 = fechaTiempo.format(df);
        System.out.println("formato2 = " + formato2);
        String formato3 = df.format(fechaTiempo);
        System.out.println("formato3 = " + formato3);
    }
}
