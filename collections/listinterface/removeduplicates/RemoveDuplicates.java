package listinterface.removeduplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void removeDuplicatesElement(ArrayList<Integer> list) {
        List<Integer> removedDuplicate = new ArrayList<>();
        for (int num : list) {
            if (!removedDuplicate.contains(num)) {
                removedDuplicate.add(num);
            }
        }
        System.out.println(removedDuplicate);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4));
        removeDuplicatesElement(list);
    }
}
