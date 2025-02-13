package streams.datastreams;

public class StudentMain {
    public static void main(String[] args) {
        // Create sample students
        Student[] students = {
                new Student(101, "Alice", 3.8),
                new Student(102, "Bob", 3.5),
                new Student(103, "Charlie", 3.9)
        };

        // Write students to file
        StudentInOutStream.writeStudentsToFile(students);

        // Read students from file
        StudentInOutStream.readStudentsFromFile();
    }
}
