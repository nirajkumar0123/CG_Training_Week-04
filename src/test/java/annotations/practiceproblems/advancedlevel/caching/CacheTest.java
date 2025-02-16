package annotations.practiceproblems.advancedlevel.caching;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Proxy;

class CacheTest {

    ExpensiveComputation original = new ExpensiveComputationImpl();
    ExpensiveComputation proxyInstance = (ExpensiveComputation) Proxy.newProxyInstance(
            ExpensiveComputation.class.getClassLoader(),
            new Class[]{ExpensiveComputation.class},
            new CacheInterceptor(original)
    );

    @Test
    void testFactorialCaching() {
        int result1 = proxyInstance.computeFactorial(4); // Computes
        int result2 = proxyInstance.computeFactorial(4); // Returns cached result
        assertEquals(result1, result2);
    }

    @Test
    void testFactorialComputation() {
        assertEquals(120, proxyInstance.computeFactorial(5));
    }

    @Test
    void testDifferentInputs() {
        int result5 = proxyInstance.computeFactorial(5);
        int result6 = proxyInstance.computeFactorial(6);
        assertNotEquals(result5, result6);
    }
}

