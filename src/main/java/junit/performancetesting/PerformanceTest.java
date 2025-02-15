package junit.performancetesting;

public class PerformanceTest {
    public String longRunningTask() {
        try {
            Thread.sleep(1500); // Simulates a long-running task (3 seconds)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Task Completed";
    }
}

