package collections.insurancepolicymanagementsystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class InsuranceMain {
    public static void main(String[] args) throws ParseException {
        InsurancePolicyManager manager = new InsurancePolicyManager();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // Add sample policies
        manager.addPolicy(new InsurancePolicy("P1001", "Alice", sdf.parse("2025-06-10"), "Health", 1000.0));
        manager.addPolicy(new InsurancePolicy("P1002", "Bob", sdf.parse("2024-03-15"), "Auto", 1500.0));
        manager.addPolicy(new InsurancePolicy("P1003", "Carol", sdf.parse("2024-04-05"), "Home", 1200.0));

        // Display all policies
        System.out.println("All Policies:");
        manager.getAllPolicies().forEach(System.out::println);

        // Policies expiring soon
        System.out.println("\nExpiring Soon:");
        manager.getExpiringSoon().forEach(System.out::println);

        // Filter policies by coverage type
        System.out.println("\nAuto Policies:");
        manager.getPoliciesByCoverageType("Auto").forEach(System.out::println);

        // Find duplicate policies
        System.out.println("\nDuplicate Policies:");
        manager.findDuplicatePolicies().forEach(System.out::println);

        // Performance test
        System.out.println("\nPerformance Comparison:");
        PerformanceTester.comparePerformance();
    }
}

