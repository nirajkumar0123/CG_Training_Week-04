package reflection.advancedlevel.dicontainer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DIContainerTest {

    @Test
    public void testServiceARegistration() throws Exception {
        DIContainer container = new DIContainer();
        container.register(ServiceA.class);

        ServiceA serviceA = container.getInstance(ServiceA.class);
        assertNotNull(serviceA);
    }

    @Test
    public void testDependencyInjection() throws Exception {
        DIContainer container = new DIContainer();
        container.register(ServiceA.class);
        container.register(ServiceB.class);

        ServiceB serviceB = container.getInstance(ServiceB.class);
        assertNotNull(serviceB);
        assertNotNull(serviceB.getClass().getDeclaredField("serviceA"));
    }

    @Test
    public void testServiceBExecution() throws Exception {
        DIContainer container = new DIContainer();
        container.register(ServiceA.class);
        container.register(ServiceB.class);

        ServiceB serviceB = container.getInstance(ServiceB.class);
        serviceB.execute();
    }
}
