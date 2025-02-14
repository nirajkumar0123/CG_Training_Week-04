package exceptions.nestedtrycatch;

import java.util.Scanner;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter array length: ");
            int n = sc.nextInt();

            System.out.println("Enter array elements: ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Enter index: ");
            int index = sc.nextInt();

            System.out.println("Enter divisor: \n");
            int divisor = sc.nextInt();

            try {
                int value = arr[index];
                try {
                    int divisonResult = value / divisor;
                    System.out.println("Result: " + divisonResult);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }

        } catch (Exception e) {
            System.out.println("(\"An error occurred: \" + e.getMessage()");
        }
        sc.close();
    }
}

