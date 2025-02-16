package reflection.advancedlevel.loggingproxy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LoggingProxyTest {

    @Test
    public void testMethodInvocationLogging() {
        Greeting greeting = new GreetingImpl();
        Greeting proxy = LoggingProxy.createProxy(greeting, Greeting.class);

        // Capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        proxy.sayHello("Bob");

        // Verify log output
        String consoleOutput = outContent.toString().trim();
        assertTrue(consoleOutput.contains("Executing method: sayHello"));
    }

    @Test
    public void testProxyReturnsCorrectOutput() {
        Greeting greeting = new GreetingImpl();
        Greeting proxy = LoggingProxy.createProxy(greeting, Greeting.class);

        assertEquals("Hello, Charlie!", proxy.sayHello("Charlie"));
    }

    @Test
    public void testMultipleMethodCalls() {
        Greeting greeting = new GreetingImpl();
        Greeting proxy = LoggingProxy.createProxy(greeting, Greeting.class);

        proxy.sayHello("Dave");
        proxy.sayHello("Eve");

        // Proxy should log each call
        assertEquals("Hello, Dave!", proxy.sayHello("Dave"));
        assertEquals("Hello, Eve!", proxy.sayHello("Eve"));
    }
}
