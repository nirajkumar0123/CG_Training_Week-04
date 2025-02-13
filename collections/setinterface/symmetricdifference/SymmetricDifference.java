package setinterface.symmetricdifference;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static Set<Integer>  unionOfSets(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static Set<Integer> intersectionOfSets(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }

    public static Set<Integer> findSymmetricDifference(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> symmetricDiff = unionOfSets(set1, set2); // Union of sets
        Set<Integer> intersection = intersectionOfSets(set1, set2); // Intersection

        symmetricDiff.removeAll(intersection); // Remove common elements
        return symmetricDiff;
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        System.out.println("Symmetric Difference: " + findSymmetricDifference(set1, set2));
    }
}
