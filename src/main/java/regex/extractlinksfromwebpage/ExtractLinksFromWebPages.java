package regex.extractlinksfromwebpage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinksFromWebPages {
    public static void main(String[] args) {
        String links = "Visit https://www.google.com and http://example.org for more info.";

        String regex = "\\bhttps?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(links);

        System.out.println("Extracting Links: ");

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
