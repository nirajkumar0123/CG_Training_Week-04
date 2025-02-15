package regex.validateusername;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserNameProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        while(true){
            System.out.println("Enter Your text: ");
            String text = sc.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            System.out.println("Username Valid: "+matcher.matches());
            System.out.println("Want to exit: Y/N");
            String str = sc.nextLine();
            if(str.equals("Y")){
                break;
            }
        }

    }
}
