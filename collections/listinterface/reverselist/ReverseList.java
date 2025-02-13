package listinterface.reverselist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ReverseList {
    public static void reverseArrayList(ArrayList<Integer> list) {
        int n = list.size();
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    // Method to reverse a LinkedList
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }

    public static void main(String[] args) {
        Integer[] list = {1, 2, 3, 4, 5};
        // ArrayList Example
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(list));
        reverseArrayList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        // LinkedList Example
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(list));
        linkedList = reverseLinkedList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }
}
