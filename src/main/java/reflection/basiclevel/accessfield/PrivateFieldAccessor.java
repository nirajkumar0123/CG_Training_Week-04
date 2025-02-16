package reflection.basiclevel.accessfield;

import java.lang.reflect.Field;

public class PrivateFieldAccessor {
    public static void main(String[] args) {
        try {
            Person person = new Person(25);

            Field ageField = Person.class.getDeclaredField("age");
            ageField.setAccessible(true);
            ageField.set(person, 30);

            System.out.println("Modified Age: " + person.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

