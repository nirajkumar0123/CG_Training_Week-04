package exceptions.finallyblock;

import java.util.Scanner;

public class IntegerDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter num1: ");
            int num1 = sc.nextInt();

            System.out.println("Enter num2: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Divison by zero is not allowed");
        } finally {
            System.out.println("Operation completed");
        }
    }
}
