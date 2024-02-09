package common;

public class StringUtils {
    public static void writeOutput(String firstHeader, String firstValue, String secondHeader, String secondValue){
        System.out.println(
            "\n \n" +
                firstHeader + firstValue + "\n" 
                + secondHeader + secondValue + 
            "\n \n"
        );
    };
}
