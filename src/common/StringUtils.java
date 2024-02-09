package common;

public class StringUtils {

    /**
     * Imprime em padrão cabeçalhos e valores.
     * @param firstHeader
     * @param firstValue
     * @param secondHeader
     * @param secondValue
     */
    public static void writeOutput(String firstHeader, String firstValue, String secondHeader, String secondValue){
        System.out.println(
            "\n \n" +
                firstHeader + firstValue + "\n" 
                + secondHeader + secondValue + 
            "\n \n"
        );
    };
}
