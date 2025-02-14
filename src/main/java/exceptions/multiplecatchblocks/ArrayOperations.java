package exceptions.multiplecatchblocks;

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter array size: ");
            int n = sc.nextInt();

            int[] arr = null;

            if (n > 0) {
                System.out.println("Enter Array: ");
                arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
            }

            System.out.println("Enter index: ");
            int index = sc.nextInt();

            System.out.println("Value at given index is:: " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}
