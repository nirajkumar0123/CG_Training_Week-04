package annotations.repeatable;

public class BugTracker {

    @BugReport(description = "Null pointer exception when input is null")
    @BugReport(description = "Performance issue on large data sets")
    public void processTask() {
        System.out.println("Processing task...");
    }
}
