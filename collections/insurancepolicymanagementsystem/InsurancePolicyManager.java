package collections.insurancepolicymanagementsystem;

import java.util.*;

public class InsurancePolicyManager {
    private final Set<InsurancePolicy> hashSetPolicies = new HashSet<>();
    private final Set<InsurancePolicy> linkedHashSetPolicies = new LinkedHashSet<>();
    private final Set<InsurancePolicy> treeSetPolicies = new TreeSet<>();

    public void addPolicy(InsurancePolicy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    public Set<InsurancePolicy> getAllPolicies() {
        return new HashSet<>(hashSetPolicies);
    }

    public Set<InsurancePolicy> getExpiringSoon() {
        Set<InsurancePolicy> expiringSoon = new TreeSet<>();
        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        calendar.add(Calendar.DAY_OF_YEAR, 30);
        Date thresholdDate = calendar.getTime();

        for (InsurancePolicy policy : treeSetPolicies) {
            if (policy.getExpiryDate().before(thresholdDate)) {
                expiringSoon.add(policy);
            }
        }
        return expiringSoon;
    }

    public Set<InsurancePolicy> getPoliciesByCoverageType(String coverageType) {
        Set<InsurancePolicy> filteredPolicies = new HashSet<>();
        for (InsurancePolicy policy : hashSetPolicies) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                filteredPolicies.add(policy);
            }
        }
        return filteredPolicies;
    }

    public Set<String> findDuplicatePolicies() {
        Set<String> duplicatePolicyNumbers = new HashSet<>();
        Set<String> seenPolicyNumbers = new HashSet<>();

        for (InsurancePolicy policy : hashSetPolicies) {
            if (!seenPolicyNumbers.add(policy.getPolicyNumber())) {
                duplicatePolicyNumbers.add(policy.getPolicyNumber());
            }
        }
        return duplicatePolicyNumbers;
    }
}
