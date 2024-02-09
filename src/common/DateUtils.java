package common;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;

public class DateUtils {

        /**
     * Verifica a vigencia entre uma data passada até o momento atual
     * @param previousDate
     */
    public static int calculateYearsPassed(LocalDate previousDate) {
        LocalDate currentDate = LocalDate.now();

        if (previousDate.isAfter(currentDate)) {
            throw new IllegalArgumentException("A data anterior não pode ser posterior à data atual.");
        };

        Period period = Period.between(previousDate, currentDate);
        
        return period.getYears();
    }


    /**
     * Retorna o ultimo dia do mês
     * @param year
     * @param month
     */
    public static LocalDate lastDayOfMonth(int year, Month month){
        YearMonth yearMonth = YearMonth.of(year, month);
        LocalDate lastDayOfMonth = yearMonth.atEndOfMonth();

        return lastDayOfMonth;
    }
}