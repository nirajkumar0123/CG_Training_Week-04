package reflection.intermediatelevel.mathoperations;

import java.lang.reflect.Method;
import java.util.Scanner;

public class MethodInvoker {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // Get user input
            System.out.print("Enter method name (add, subtract, multiply): ");
            String methodName = scanner.nextLine();
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            // Get MathOperations class reference
            Class<?> clazz = MathOperations.class;
            Object instance = clazz.getDeclaredConstructor().newInstance();

            // Get the method dynamically
            Method method = clazz.getMethod(methodName, int.class, int.class);

            // Invoke the method dynamically
            Object result = method.invoke(instance, num1, num2);
            System.out.println("Result: " + result);

            scanner.close();
        } catch (NoSuchMethodException e) {
            System.out.println("Error: Invalid method name!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

