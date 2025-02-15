package regex.advancedproblem.validateipaddress;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIPAddressProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "\\b(25[0-5]|2[0-4][0-9]|1?[0-9]{1,2})\\."
                + "(25[0-5]|2[0-4][0-9]|1?[0-9]{1,2})\\."
                + "(25[0-5]|2[0-4][0-9]|1?[0-9]{1,2})\\."
                + "(25[0-5]|2[0-4][0-9]|1?[0-9]{1,2})\\b";

        while(true){
            System.out.println("Enter your IP address: ");
            String text = sc.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            if(matcher.matches()){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }
            System.out.println("Want to exit: Y/N");
            String str = sc.nextLine();
            if(str.equals("Y")){
                break;
            }
        }
    }
}
