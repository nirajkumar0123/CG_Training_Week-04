package collections.insurancepolicymanagementsystem;

import java.util.*;

public class PerformanceTester {
    public static void comparePerformance() {
        int numPolicies = 100000;
        Set<InsurancePolicy> hashSet = new HashSet<>();
        Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
        Set<InsurancePolicy> treeSet = new TreeSet<>();

        List<Set<InsurancePolicy>> sets = Arrays.asList(hashSet, linkedHashSet, treeSet);
        String[] setNames = {"HashSet", "LinkedHashSet", "TreeSet"};

        for (int i = 0; i < sets.size(); i++) {
            Set<InsurancePolicy> set = sets.get(i);
            String setName = setNames[i];

            long startTime = System.nanoTime();
            for (int j = 0; j < numPolicies; j++) {
                set.add(new InsurancePolicy("P" + j, "Holder" + j, new Date(), "Auto", 500.0));
            }
            long endTime = System.nanoTime();
            System.out.println(setName + " Insert Time: " + (endTime - startTime) / 1e6 + " ms");

            startTime = System.nanoTime();
            set.contains(new InsurancePolicy("P50000", "Holder50000", new Date(), "Auto", 500.0));
            endTime = System.nanoTime();
            System.out.println(setName + " Search Time: " + (endTime - startTime) / 1e6 + " ms");

            startTime = System.nanoTime();
            set.remove(new InsurancePolicy("P50000", "Holder50000", new Date(), "Auto", 500.0));
            endTime = System.nanoTime();
            System.out.println(setName + " Remove Time: " + (endTime - startTime) / 1e6 + " ms");

            System.out.println();
        }
    }
}

