package setinterface.findsubsets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindSubsets {
    public static boolean findSubsets(Set<Integer> set1, Set<Integer> set2) {
        if (set1.size() >= set2.size()) {
            return set1.containsAll(set2);
        }
        return set2.containsAll(set1);
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(findSubsets(set1, set2));
        System.out.println(findSubsets(set2, set1));
    }
}
