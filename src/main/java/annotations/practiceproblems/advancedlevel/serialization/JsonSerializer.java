package annotations.practiceproblems.advancedlevel.serialization;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSerializer {

    public static String serialize(Object obj) {
        Map<String, Object> jsonMap = new HashMap<>();
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                JsonField annotation = field.getAnnotation(JsonField.class);
                try {
                    jsonMap.put(annotation.name(), field.get(obj));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(jsonMap);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
    }
}

