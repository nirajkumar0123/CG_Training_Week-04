package regex.advancedproblem.extractcurrencyvalues;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrencyValuesFromText {
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";

        String[] currencyVal = {};

        String regex = "\\$?\\d+\\.\\d{2}";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);
        System.out.println("Extracted currency values are: ");
        StringBuilder result = new StringBuilder();
        while(matcher.find()){
            result.append(matcher.group()).append(", ");
        }

        if(!result.isEmpty()) {
            result.setLength(result.length()-2);
        }

        System.out.println(result);
    }
}
