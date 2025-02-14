package exceptions.throwvsthrows;

public class ExceptionPropagation {
    static void calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        double calculatedInterest = amount * rate * years / 100;
        System.out.println("Calculated Interest is: " + calculatedInterest);
    }

    public static void main(String[] args) {
        try {
            calculateInterest(100, -10, 1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
