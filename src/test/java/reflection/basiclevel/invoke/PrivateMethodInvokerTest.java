package reflection.basiclevel.invoke;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class PrivateMethodInvokerTest {

    @Test
    public void testInvokeMultiply() throws Exception {
        Calculator calculator = new Calculator();
        Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        multiplyMethod.setAccessible(true);
        int result = (int) multiplyMethod.invoke(calculator, 6, 7);
        assertEquals(42, result);
    }

    @Test
    public void testMultiplyWithZero() throws Exception {
        Calculator calculator = new Calculator();
        Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        multiplyMethod.setAccessible(true);
        int result = (int) multiplyMethod.invoke(calculator, 10, 0);
        assertEquals(0, result);
    }

    @Test
    public void testMultiplyWithNegativeNumbers() throws Exception {
        Calculator calculator = new Calculator();
        Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        multiplyMethod.setAccessible(true);
        int result = (int) multiplyMethod.invoke(calculator, -3, 5);
        assertEquals(-15, result);
    }
}
