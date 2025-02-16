package annotations.practiceproblems.intermediatelevel.logging;

public class TaskProcessor {

    @LogExecutionTime
    public void performHeavyTask() {
        long sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += i;
        }
        System.out.println("Heavy task completed.");
    }

    @LogExecutionTime
    public void performLightTask() {
        System.out.println("Light task completed.");
    }

    public void normalTask() {
        System.out.println("This is a normal task.");
    }

    public static void main(String[] args) {
        TaskProcessor processor = new TaskProcessor();
        ExecutionTimer.measureExecutionTime(processor, "performHeavyTask");
        ExecutionTimer.measureExecutionTime(processor, "performLightTask");
        ExecutionTimer.measureExecutionTime(processor, "normalTask");  // No annotation, should not measure
    }
}

