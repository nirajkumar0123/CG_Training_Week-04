package exceptions.banktransactionsystem;

public class BankAccountSystem {
    private final double balance;

    public BankAccountSystem(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        } else if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        double newBalance = balance - amount;
        System.out.println("Withdrawal successful, new balance: " + newBalance);
    }

    public static void main(String[] args) {
        BankAccountSystem account = new BankAccountSystem(1000);

        try {
            account.withdraw(1500);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
