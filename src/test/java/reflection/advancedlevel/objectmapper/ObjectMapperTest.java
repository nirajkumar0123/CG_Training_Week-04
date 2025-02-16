package reflection.advancedlevel.objectmapper;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Map;

public class ObjectMapperTest {

    @Test
    public void testObjectMappingSuccess() {
        Map<String, Object> personData = Map.of("name", "Alice", "age", 25);
        Person person = ObjectMapper.toObject(Person.class, personData);

        assertNotNull(person);
        assertEquals("Alice", person.getName());
        assertEquals(25, person.getAge());
    }

    @Test
    public void testMissingFieldHandling() {
        Map<String, Object> personData = Map.of("name", "Bob", "height", 180);
        Person person = ObjectMapper.toObject(Person.class, personData);

        assertNotNull(person);
        assertEquals("Bob", person.getName());
    }

    @Test
    public void testEmptyMap() {
        Map<String, Object> emptyData = Map.of();
        Person person = ObjectMapper.toObject(Person.class, emptyData);

        assertNotNull(person);
        assertNull(person.getName()); // Default value (null for String)
        assertEquals(0, person.getAge()); // Default value (0 for int)
    }
}
