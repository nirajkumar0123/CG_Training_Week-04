package insurancepolicysystem;

import java.util.*;

public class InsurancePolicyManager {
    private final Map<String, InsurancePolicy> hashMapPolicies = new HashMap<>();
    private final Map<String, InsurancePolicy> linkedHashMapPolicies = new LinkedHashMap<>();
    private final TreeMap<Date, InsurancePolicy> treeMapPolicies = new TreeMap<>();

    // Add a policy to all maps
    public void addPolicy(InsurancePolicy policy) {
        hashMapPolicies.put(policy.getPolicyNumber(), policy);
        linkedHashMapPolicies.put(policy.getPolicyNumber(), policy);
        treeMapPolicies.put(policy.getExpiryDate(), policy);
    }

    // Retrieve a policy by policy number
    public InsurancePolicy getPolicyByNumber(String policyNumber) {
        return hashMapPolicies.getOrDefault(policyNumber, null);
    }

    // List all policies expiring in the next 30 days
    public List<InsurancePolicy> getExpiringSoon() {
        List<InsurancePolicy> expiringSoon = new ArrayList<>();
        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        calendar.add(Calendar.DAY_OF_YEAR, 30);
        Date thresholdDate = calendar.getTime();

        for (Map.Entry<Date, InsurancePolicy> entry : treeMapPolicies.entrySet()) {
            if (entry.getKey().before(thresholdDate) && entry.getKey().after(today)) {
                expiringSoon.add(entry.getValue());
            }
        }
        return expiringSoon;
    }

    // List all policies for a specific policyholder
    public List<InsurancePolicy> getPoliciesByHolder(String policyholder) {
        List<InsurancePolicy> policies = new ArrayList<>();
        for (InsurancePolicy policy : hashMapPolicies.values()) {
            if (policy.getPolicyholderName().equalsIgnoreCase(policyholder)) {
                policies.add(policy);
            }
        }
        return policies;
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        Date today = new Date(); // Get the current date
        Iterator<Map.Entry<Date, InsurancePolicy>> iterator = treeMapPolicies.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Date, InsurancePolicy> entry = iterator.next();

            // Remove only policies where the expiry date is STRICTLY before today
            if (entry.getKey().before(today)) {
                System.out.println("Removing Expired Policy: " + entry.getValue());

                // Remove from all collections
                hashMapPolicies.remove(entry.getValue().getPolicyNumber());
                linkedHashMapPolicies.remove(entry.getValue().getPolicyNumber());
                iterator.remove(); // Remove from TreeMap
            }
        }
    }


    // Display all policies
    public void displayAllPolicies() {
        if (linkedHashMapPolicies.isEmpty()) {
            System.out.println("No policies available.");
            return;
        }
        for (InsurancePolicy policy : linkedHashMapPolicies.values()) {
            System.out.println(policy);
        }
    }
}
