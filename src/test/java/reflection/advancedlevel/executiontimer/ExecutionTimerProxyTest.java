package reflection.advancedlevel.executiontimer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ExecutionTimerProxyTest {

    @Test
    public void testMethodExecutionTimeLogging() {
        Calculator calculator = new CalculatorImpl();
        Calculator proxy = ExecutionTimerProxy.createProxy(calculator, Calculator.class);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        proxy.add(10, 20);
        proxy.multiply(3, 5);

        String consoleOutput = outContent.toString().trim();
        assertTrue(consoleOutput.contains("Execution time for add"));
        assertTrue(consoleOutput.contains("Execution time for multiply"));
    }

    @Test
    public void testAdditionResult() {
        Calculator calculator = new CalculatorImpl();
        Calculator proxy = ExecutionTimerProxy.createProxy(calculator, Calculator.class);
        assertEquals(15, proxy.add(10, 5));
    }

    @Test
    public void testMultiplicationResult() {
        Calculator calculator = new CalculatorImpl();
        Calculator proxy = ExecutionTimerProxy.createProxy(calculator, Calculator.class);
        assertEquals(20, proxy.multiply(4, 5));
    }
}
