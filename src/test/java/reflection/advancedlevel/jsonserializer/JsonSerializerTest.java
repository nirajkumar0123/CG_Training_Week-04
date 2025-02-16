package reflection.advancedlevel.jsonserializer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JsonSerializerTest {

    @Test
    public void testJsonSerialization() {
        Person person = new Person("Alice", 25, true);
        String json = JsonSerializer.toJson(person);
        assertEquals("{\"name\": \"Alice\", \"age\": 25, \"isStudent\": true}", json);
    }

    @Test
    public void testNullObjectSerialization() {
        String json = JsonSerializer.toJson(null);
        assertEquals("null", json);
    }

    @Test
    public void testEmptyObjectSerialization() {
        class EmptyClass {}
        EmptyClass emptyObj = new EmptyClass();
        String json = JsonSerializer.toJson(emptyObj);
        assertEquals("{}", json);
    }
}
