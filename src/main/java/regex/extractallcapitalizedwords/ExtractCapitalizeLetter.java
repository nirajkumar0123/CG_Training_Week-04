package regex.extractallcapitalizedwords;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalizeLetter {
    public static void main(String[] args) {
        String sentence = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        String regex = "\\b(?!The)[A-Z][a-z]*\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        System.out.println("Extracting capitalize words: ");

        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append(matcher.group()).append(", ");
        }
        if (!result.isEmpty()) {
            result.setLength(result.length() - 2);
        }

        System.out.println(result);
    }
}
