package setinterface.settosortedlist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetToSortedList {
    public static void setToSortedList(Set<Integer> set){
        Set<Integer> sortedList = new TreeSet<>(set);
        System.out.println(sortedList);
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        setToSortedList(set1);
    }
}
