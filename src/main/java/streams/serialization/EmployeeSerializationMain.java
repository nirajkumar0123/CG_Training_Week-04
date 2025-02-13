package streams.serialization;

import java.util.ArrayList;
import java.util.List;

public class EmployeeSerializationMain {
    public static void main(String[] args) {
        String fileName = "src/main/java/streams/serialization/employees.ser";

        // Create employee list
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", "HR", 50000));
        employees.add(new Employee(2, "Bob", "IT", 60000));
        employees.add(new Employee(3, "Charlie", "Finance", 70000));

        // Serialize the employee list
        EmployeeSerialization.serializeEmployees(employees, fileName);

        // Deserialize and display employees
        List<Employee> retrievedEmployees = EmployeeSerialization.deserializeEmployees();
        if (retrievedEmployees != null) {
            System.out.println("\nRetrieved Employees:");
            retrievedEmployees.forEach(System.out::println);
        }
    }
}


