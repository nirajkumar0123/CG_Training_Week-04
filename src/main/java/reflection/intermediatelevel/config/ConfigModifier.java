package reflection.intermediatelevel.config;

import java.lang.reflect.Field;

public class ConfigModifier {
    public static void main(String[] args) {
        try {
            Field field = Configuration.class.getDeclaredField("API_KEY");
            field.setAccessible(true);
            field.set(null, "NEW_SECRET_KEY");

            System.out.println("Modified API_KEY: " + Configuration.getApiKey());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

