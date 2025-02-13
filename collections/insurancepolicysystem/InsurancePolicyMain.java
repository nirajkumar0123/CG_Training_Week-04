package insurancepolicysystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class InsurancePolicyMain {
    public static void main(String[] args) throws ParseException {
        InsurancePolicyManager manager = new InsurancePolicyManager();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // Adding sample policies
        manager.addPolicy(new InsurancePolicy("P1001", "Alice", sdf.parse("2025-06-10"), "Health", 1000.0));
        manager.addPolicy(new InsurancePolicy("P1002", "Bob", sdf.parse("2024-03-15"), "Auto", 1500.0));
        manager.addPolicy(new InsurancePolicy("P1003", "Carol", sdf.parse("2024-04-05"), "Home", 1200.0));
        manager.addPolicy(new InsurancePolicy("P1004", "Alice", sdf.parse("2024-07-20"), "Life", 2000.0));

        // Display all policies
        System.out.println("All Policies:");
        manager.displayAllPolicies();

        // Retrieve policy by number
        System.out.println("\nRetrieve Policy P1002:");
        InsurancePolicy policy = manager.getPolicyByNumber("P1002");
        if (policy != null) {
            System.out.println(policy);
        } else {
            System.out.println("Policy P1002 not found.");
        }

        // Policies expiring soon
        System.out.println("\nExpiring Soon:");
        if (manager.getExpiringSoon().isEmpty()) {
            System.out.println("No policies expiring soon.");
        } else {
            manager.getExpiringSoon().forEach(System.out::println);
        }

        // Policies for a specific policyholder
        System.out.println("\nPolicies for Alice:");
        if (manager.getPoliciesByHolder("Alice").isEmpty()) {
            System.out.println("No policies found for Alice.");
        } else {
            manager.getPoliciesByHolder("Alice").forEach(System.out::println);
        }

        // Remove expired policies
        manager.removeExpiredPolicies();
        System.out.println("\nAfter Removing Expired Policies:");
        manager.displayAllPolicies();
    }
}

