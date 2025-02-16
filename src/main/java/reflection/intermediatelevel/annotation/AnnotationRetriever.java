package reflection.intermediatelevel.annotation;

public class AnnotationRetriever {
    public static void main(String[] args) {
        Class<Book> bookClass = Book.class;

        if (bookClass.isAnnotationPresent(Author.class)) {
            Author authorAnnotation = bookClass.getAnnotation(Author.class);
            System.out.println("Author Name: " + authorAnnotation.name());
        } else {
            System.out.println("No @Author annotation found.");
        }
    }
}

