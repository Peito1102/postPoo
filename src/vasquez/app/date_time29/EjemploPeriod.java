package vasquez.app.date_time29;

import java.time.LocalDate;
import java.time.Period;

public class EjemploPeriod {
    public static void main(String[] args) {
        LocalDate fecha1 = LocalDate.of(2011,9,23);
        LocalDate fecha2 = LocalDate.of(2021,11,25);
        LocalDate fecha3 = fecha2.withMonth(12);
        fecha2 = fecha2.withDayOfMonth(1);

        Period periodo = Period.between(fecha1,fecha2);
        System.out.println(periodo);
        System.out.printf("Periodo entre %s y %s hay %d años, %d meses y %d dias"
                ,fecha1,fecha2,periodo.getYears(),periodo.getMonths(),periodo.getDays());


    }
}
