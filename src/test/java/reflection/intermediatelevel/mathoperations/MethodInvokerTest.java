package reflection.intermediatelevel.mathoperations;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

public class MethodInvokerTest {

    @Test
    public void testAddition() throws Exception {
        MathOperations mathOperations = new MathOperations();
        Method method = MathOperations.class.getMethod("add", int.class, int.class);
        Object result = method.invoke(mathOperations, 10, 5);
        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() throws Exception {
        MathOperations mathOperations = new MathOperations();
        Method method = MathOperations.class.getMethod("subtract", int.class, int.class);
        Object result = method.invoke(mathOperations, 10, 5);
        assertEquals(5, result);
    }

    @Test
    public void testMultiplication() throws Exception {
        MathOperations mathOperations = new MathOperations();
        Method method = MathOperations.class.getMethod("multiply", int.class, int.class);
        Object result = method.invoke(mathOperations, 4, 6);
        assertEquals(24, result);
    }
}
