package reflection.advancedlevel.dicontainer;

public class Main {
    public static void main(String[] args) throws Exception {
        DIContainer container = new DIContainer();

        // Register dependencies
        container.register(ServiceA.class);
        container.register(ServiceB.class);

        // Get an instance with dependencies injected
        ServiceB serviceB = container.getInstance(ServiceB.class);
        serviceB.execute();
    }
}

