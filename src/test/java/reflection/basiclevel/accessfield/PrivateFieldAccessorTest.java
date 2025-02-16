package reflection.basiclevel.accessfield;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import static org.junit.jupiter.api.Assertions.*;

public class PrivateFieldAccessorTest {

    @Test
    public void testModifyPrivateField() throws Exception {
        Person person = new Person(25);
        Field ageField = Person.class.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(person, 35);
        assertEquals(35, person.getAge());
    }

    @Test
    public void testRetrievePrivateField() throws Exception {
        Person person = new Person(40);
        Field ageField = Person.class.getDeclaredField("age");
        ageField.setAccessible(true);
        int ageValue = (int) ageField.get(person);
        assertEquals(40, ageValue);
    }

    @Test
    public void testInitialAge() {
        Person person = new Person(20);
        assertEquals(20, person.getAge());
    }
}
