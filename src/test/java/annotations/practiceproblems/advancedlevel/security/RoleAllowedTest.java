package annotations.practiceproblems.advancedlevel.security;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

class RoleAllowedTest {

    @Test
    void testAdminAccessAllowed() {
        SecureService service = new SecureService();
        AccessController adminUser = new AccessController("ADMIN");

        assertDoesNotThrow(() -> adminUser.invokeMethod(service, "adminTask"));
    }

    @Test
    void testUserAccessDenied() {
        SecureService service = new SecureService();
        AccessController normalUser = new AccessController("USER");

        assertDoesNotThrow(() -> normalUser.invokeMethod(service, "adminTask"));
    }

    @Test
    void testPublicTaskAccessibleToAll() throws NoSuchMethodException {
        Method method = SecureService.class.getMethod("publicTask");
        assertFalse(method.isAnnotationPresent(RoleAllowed.class));
    }
}
