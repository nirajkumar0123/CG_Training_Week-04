package annotations.legacy;

public class LegacyAPI {
    @Deprecated
    public void oldFeature() {
        System.out.println("This is the old feature, which is deprecated.");
    }

    public String newFeature() {
        return "This is the new feature, use this instead.";
    }
}

