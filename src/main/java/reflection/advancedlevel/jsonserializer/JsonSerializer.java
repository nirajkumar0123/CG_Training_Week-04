package reflection.advancedlevel.jsonserializer;

import java.lang.reflect.Field;
import java.util.StringJoiner;

public class JsonSerializer {
    public static String toJson(Object obj) {
        if (obj == null) {
            return "null";
        }
        Class<?> clazz = obj.getClass();
        StringJoiner json = new StringJoiner(", ", "{", "}");

        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            try {
                Object value = field.get(obj);
                String formattedValue = (value instanceof String) ? "\"" + value + "\"" : String.valueOf(value);
                json.add("\"" + field.getName() + "\": " + formattedValue);
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Error accessing field: " + field.getName(), e);
            }
        }
        return json.toString();
    }

    public static void main(String[] args) {
        Person person = new Person("Alice", 25, true);
        System.out.println(toJson(person));
    }
}

