package listinterface.rotateelementinlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateElementsInList {
    public static List<Integer> rotateElementsOfList(ArrayList<Integer> list, int position) {
        List<Integer> rotatedList = new ArrayList<>();
        int n = list.size(); // size of list
        position = position % n;

        rotatedList.addAll(list.subList(position, n));
        rotatedList.addAll(list.subList(0, position));

        return rotatedList;
    }

    public static void main(String[] args) {
        Integer[] list = {10, 20, 30, 40, 50};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(list));
        List<Integer> rotatedList = rotateElementsOfList(arrayList, 2);
        System.out.println(rotatedList);
    }
}
