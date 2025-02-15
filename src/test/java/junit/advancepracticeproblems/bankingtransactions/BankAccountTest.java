package junit.advancepracticeproblems.bankingtransactions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(100.0); // Initial balance set to $100
    }

    @Test
    void testDeposit() {
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), "Balance should be updated correctly after deposit.");
    }

    @Test
    void testWithdraw() {
        account.withdraw(40.0);
        assertEquals(60.0, account.getBalance(), "Balance should decrease after withdrawal.");
    }

    @Test
    void testWithdrawInsufficientFunds() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(200.0));
        assertEquals("Insufficient funds.", exception.getMessage(), "Should throw exception for insufficient funds.");
    }

    @Test
    void testNegativeDepositThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.deposit(-10.0));
        assertEquals("Deposit amount must be positive.", exception.getMessage(), "Should not allow negative deposits.");
    }

    @Test
    void testNegativeWithdrawalThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(-10.0));
        assertEquals("Withdrawal amount must be positive.", exception.getMessage(), "Should not allow negative withdrawals.");
    }
}
