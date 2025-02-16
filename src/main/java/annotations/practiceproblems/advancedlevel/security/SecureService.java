package annotations.practiceproblems.advancedlevel.security;

public class SecureService {

    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Admin task executed successfully.");
    }

    public void publicTask() {
        System.out.println("Public task executed successfully.");
    }

    public static void main(String[] args) {
        SecureService service = new SecureService();

        AccessController adminUser = new AccessController("ADMIN");
        adminUser.invokeMethod(service, "adminTask");

        AccessController normalUser = new AccessController("USER");
        normalUser.invokeMethod(service, "adminTask");

        normalUser.invokeMethod(service, "publicTask");
    }
}

