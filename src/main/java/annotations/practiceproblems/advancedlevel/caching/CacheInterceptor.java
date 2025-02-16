package annotations.practiceproblems.advancedlevel.caching;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheInterceptor implements InvocationHandler {
    private final Object target;
    private final Map<Object, Object> cache = new HashMap<>();

    public CacheInterceptor(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.isAnnotationPresent(CacheResult.class)) {
            Object key = args.length == 1 ? args[0] : args;  // Handle multiple arguments
            if (cache.containsKey(key)) {
                System.out.println("Returning cached result for: " + key);
                return cache.get(key);
            }
            Object result = method.invoke(target, args);
            cache.put(key, result);
            System.out.println("Caching result for: " + key);
            return result;
        }
        return method.invoke(target, args);
    }
}


