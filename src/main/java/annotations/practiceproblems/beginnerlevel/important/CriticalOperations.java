package annotations.practiceproblems.beginnerlevel.important;

public class CriticalOperations {

    @ImportantMethod
    public void processPayment() {
        System.out.println("Processing payment...");
    }

    @ImportantMethod(level = "MEDIUM")
    public void generateReport() {
        System.out.println("Generating report...");
    }

    public void helperMethod() {
        System.out.println("This is a helper method.");
    }
}
