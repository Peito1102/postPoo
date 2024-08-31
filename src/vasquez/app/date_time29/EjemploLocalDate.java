package vasquez.app.date_time29;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EjemploLocalDate {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        System.out.println(fechaActual);
        System.out.println(fechaActual.getDayOfMonth());
        Month mes = fechaActual.getMonth();
        System.out.println(mes);
        System.out.println(mes.getValue());
        //forma de mostrar el mes en ESPAÑOL
        System.out.println(mes.getDisplayName(TextStyle.FULL,new Locale("es","ES")));
        DayOfWeek diaSem = fechaActual.getDayOfWeek();
        System.out.println(diaSem);
        //forma de mostrar la semana en ESPAÑOL
        System.out.println(diaSem.getDisplayName(TextStyle.FULL,new Locale("es","ES")));
        System.out.println(fechaActual.getMonth());
        System.out.println(fechaActual.getYear());
        System.out.println(fechaActual.getDayOfYear());
        System.out.println(fechaActual.getEra());
        System.out.println();

        fechaActual = LocalDate.of(2020,1,29);
        System.out.println(fechaActual);

        fechaActual = LocalDate.of(2020, Month.NOVEMBER,22);
        System.out.println(fechaActual);

        fechaActual = LocalDate.parse("2020-02-11");
        System.out.println(fechaActual);

        LocalDate diaDeManana = LocalDate.now().plusDays(1);
        System.out.println(diaDeManana);

        //usando solo minusMonths
        LocalDate mesAnteriorMismoDia = LocalDate.now().minusMonths(1);
        System.out.println(mesAnteriorMismoDia);

        //usando solo minus con ChronoUnit
        LocalDate mesAnteriorMismoDia2 = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println(mesAnteriorMismoDia);

        DayOfWeek diaDeSemana = LocalDate.now().getDayOfWeek();
        System.out.println(diaDeSemana);

        int diaActual = LocalDate.of(2024,8,31).getDayOfMonth();
        System.out.println("diaActual = " + diaActual);

        boolean esBisiesto = LocalDate.now().isLeapYear();
        System.out.println("esBisiesto = " + esBisiesto);

        boolean esAntes = LocalDate.now().isBefore(LocalDate.parse("2024-08-30"));
        System.out.println("esAntes = " + esAntes);

        boolean esDespues = LocalDate.now().isAfter(LocalDate.parse("2024-08-30"));
        System.out.println("esDespues = " + esDespues);
    }
}
