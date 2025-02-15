package junit.performancetesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

class PerformanceTestTest {
    private final PerformanceTest performanceTest = new PerformanceTest();

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS) // Test will fail if execution takes more than 2 seconds
    void testLongRunningTask() {
        performanceTest.longRunningTask();
    }
}
