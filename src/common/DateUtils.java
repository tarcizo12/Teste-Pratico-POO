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
    public static int calculateYearsPassed(LocalDate dataSource, LocalDate dataTarget) {

        if (dataSource.isAfter(dataTarget)) {
            throw new IllegalArgumentException("A data anterior não pode ser posterior à data atual.");
        };

        Period period = Period.between(dataSource, dataTarget);
        
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