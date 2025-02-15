package regex.advancedproblem.validatecreditcardnumber;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCardNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "^(4\\d{15}|5\\d{15})$";

        while(true){
            System.out.println("Enter your credit card (Visa / Mastercard) number: ");
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
