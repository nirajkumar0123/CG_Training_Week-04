package junit.exceptionhandling;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }

    @Test
    void testDivideValidNumbers() {
        assertEquals(2, calculator.divide(10, 5));
        assertEquals(-3, calculator.divide(-9, 3));
        assertEquals(0, calculator.divide(0, 5));
    }
}
