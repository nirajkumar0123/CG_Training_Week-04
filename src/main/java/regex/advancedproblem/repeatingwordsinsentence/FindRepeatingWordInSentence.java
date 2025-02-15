package regex.advancedproblem.repeatingwordsinsentence;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRepeatingWordInSentence {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";

        String regex = "\\b(\\w+)\\b(?:\\s+\\1)\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        HashSet<String> repeatedWords = new HashSet<>();

        while (matcher.find()) {
            repeatedWords.add(matcher.group(1));
        }

        System.out.println("Repeating Words: " + String.join(", ", repeatedWords));
    }
}
