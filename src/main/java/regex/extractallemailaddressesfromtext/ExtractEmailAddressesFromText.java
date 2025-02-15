package regex.extractallemailaddressesfromtext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmailAddressesFromText {
    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org";

        String regex = "\\b[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Extracting email addresses: ");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
