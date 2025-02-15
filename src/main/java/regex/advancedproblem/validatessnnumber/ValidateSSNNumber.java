package regex.advancedproblem.validatessnnumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSSNNumber {
    public static void main(String[] args) {
        String text = "My SSN is 123-45-6789.";

        String regex = "\\b[0-9]{3}-[0-9]{2}-[0-9]{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if(matcher.find()){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}
