package annotations.practiceproblems.advancedlevel.serialization;

public class User {

    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_age")
    private int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public static void main(String[] args) {
        User user = new User("JohnDoe", 25);
        String jsonString = JsonSerializer.serialize(user);
        System.out.println(jsonString);
    }
}

