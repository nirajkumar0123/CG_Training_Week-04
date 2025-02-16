package reflection.intermediatelevel.annotation;

@Author(name = "John Doe")
public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

