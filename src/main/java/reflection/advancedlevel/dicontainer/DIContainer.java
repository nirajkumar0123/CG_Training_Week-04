package reflection.advancedlevel.dicontainer;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class DIContainer {
    private Map<Class<?>, Object> instances = new HashMap<>();

    public <T> void register(Class<T> clazz) throws Exception {
        // Create an instance and store it
        T instance = clazz.getDeclaredConstructor().newInstance();
        instances.put(clazz, instance);
    }

    public <T> T getInstance(Class<T> clazz) throws Exception {
        T instance = clazz.getDeclaredConstructor().newInstance();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                Class<?> fieldType = field.getType();
                Object dependency = instances.get(fieldType);
                if (dependency == null) {
                    throw new RuntimeException("No registered instance found for " + fieldType.getName());
                }
                field.setAccessible(true);
                field.set(instance, dependency);
            }
        }

        return instance;
    }
}

