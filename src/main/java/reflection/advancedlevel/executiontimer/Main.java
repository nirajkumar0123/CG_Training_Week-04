package reflection.advancedlevel.executiontimer;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        Calculator proxy = ExecutionTimerProxy.createProxy(calculator, Calculator.class);

        System.out.println("Addition Result: " + proxy.add(5, 3));
        System.out.println("Multiplication Result: " + proxy.multiply(4, 6));
    }
}

