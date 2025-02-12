package bankingsystem;

public class BankingSystemMain {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        // Adding customer accounts
        bank.addAccount("A1001", 5000.0);
        bank.addAccount("A1002", 2500.0);
        bank.addAccount("A1003", 8000.0);
        bank.addAccount("A1004", 1200.0);

        // Display all accounts
        bank.displayAccounts();

        // Request withdrawals
        bank.requestWithdrawal("A1001");
        bank.requestWithdrawal("A1003");
        bank.requestWithdrawal("A1004");

        // Process withdrawals
        bank.processWithdrawals(1000);

        // Display sorted accounts
        bank.displaySortedAccounts();
    }
}
