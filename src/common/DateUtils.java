package common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.util.Date;

public class DateUtils {

        /**
     * Verifica a vigencia entre uma data passada até o momento atual.
     * @param previousDate
     */
    public static int calculateYearsPassed(LocalDate dataSource, LocalDate dataTarget) {

        if (dataSource.isAfter(dataTarget)) {
            throw new IllegalArgumentException("A data anterior não pode ser posterior à data atual.");
        };

        Period period = Period.between(dataSource, dataTarget);
        
        return period.getYears();
    };


    /**
     * Retorna o ultimo dia do mês.
     * @param year
     * @param month
     */
    public static LocalDate lastDayOfMonth(int year, Month month){
        YearMonth yearMonth = YearMonth.of(year, month);
        LocalDate lastDayOfMonth = yearMonth.atEndOfMonth();

        return lastDayOfMonth;
    };

    /**
     * Retorna a string data em formato brasileirro.
     * @param dataString
     */
    public static String formatBrazilianDate(String dataString) throws ParseException {
        // Define o formato da data de entrada
        SimpleDateFormat formatoEntrada = new SimpleDateFormat("yyyy-MM-dd");

        // Converte a string para o formato Date
        Date data = formatoEntrada.parse(dataString);

        // Define o formato de saída
        SimpleDateFormat formatoSaida = new SimpleDateFormat("dd/MM/yyyy");

        // Formata a data para o formato brasileiro
        return formatoSaida.format(data);
    }
}