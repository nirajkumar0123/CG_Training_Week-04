package reflection.basiclevel.dynamic;

public class Student {
    private String name;
    private int age;

    public Student() {
        this.name = "Default";
        this.age = 18;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

