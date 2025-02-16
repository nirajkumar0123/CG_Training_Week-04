package annotations.practiceproblems.advancedlevel.security;

import java.lang.reflect.Method;

public class AccessController {

    private String currentUserRole;

    public AccessController(String role) {
        this.currentUserRole = role;
    }

    public void invokeMethod(Object obj, String methodName) {
        try {
            Method method = obj.getClass().getMethod(methodName);
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed annotation = method.getAnnotation(RoleAllowed.class);
                if (!annotation.value().equalsIgnoreCase(currentUserRole)) {
                    System.out.println("Access Denied!");
                    return;
                }
            }
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

