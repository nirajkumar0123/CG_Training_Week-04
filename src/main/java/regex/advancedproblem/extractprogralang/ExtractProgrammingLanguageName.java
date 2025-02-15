package regex.advancedproblem.extractprogralang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguageName {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet";

        String regex = "\\b(Java|JavaScript|Python|Go)\\b";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);
        System.out.println("Extracted programming lang are: ");
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
