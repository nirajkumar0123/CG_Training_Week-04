package exceptions.exceptionpropagation;

public class PropagationMethods {
    static void method1(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Error: Dividing by zero!");
        }
        int result = num1 / num2;
        System.out.println("Result is: " + result);
    }

    static void method2(int num1, int num2) throws ArithmeticException {
        method1(num1, num2);
    }

    public static void main(String[] args) {
        try {
            method2(6, 3);
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main! \n" + e.getMessage());
        }
    }
}
