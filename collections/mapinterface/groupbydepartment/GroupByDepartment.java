package mapinterface.groupbydepartment;
import java.util.*;


public class GroupByDepartment {
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> departmentMap = new HashMap<>();

        for (Employee emp : employees) {
            // Get the existing list or create a new one
            departmentMap.putIfAbsent(emp.department, new ArrayList<>());
            departmentMap.get(emp.department).add(emp);
        }

        return departmentMap;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> groupedEmployees = groupByDepartment(employees);

        // Print the grouped employees
        groupedEmployees.forEach((dept, empList) -> System.out.println(dept + ": " + empList));
    }
}
