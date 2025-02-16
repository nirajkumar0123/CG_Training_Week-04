package reflection.advancedlevel.dicontainer;

public class ServiceB {
    @Inject
    private ServiceA serviceA;

    public void execute() {
        System.out.println("ServiceB is calling ServiceA...");
        serviceA.performTask();
    }
}

