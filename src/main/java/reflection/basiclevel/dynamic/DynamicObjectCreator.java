package reflection.basiclevel.dynamic;

import java.lang.reflect.Constructor;

public class DynamicObjectCreator {
    public static void main(String[] args) {
        try {
            Class<?> studentClass = Class.forName("com.example.reflection.dynamic.Student");

            Object studentInstance = studentClass.getDeclaredConstructor().newInstance();
            System.out.println("Student Object Created: " + studentInstance);

            Constructor<?> paramConstructor = studentClass.getDeclaredConstructor(String.class, int.class);
            Object studentWithParams = paramConstructor.newInstance("John Doe", 22);
            System.out.println("Student with Params Created: " + studentWithParams);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

