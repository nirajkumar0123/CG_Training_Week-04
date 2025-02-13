package listinterface.nthelementfromend;

import java.util.LinkedList;
import java.util.ListIterator;

public class NthElementFromEnd {
    public static String findNthFromEnd(LinkedList<String> list, int N) {
        ListIterator<String> first = list.listIterator();
        ListIterator<String> second = list.listIterator();

        // Move 'first' N steps ahead
        for (int i = 0; i < N; i++) {
            if (!first.hasNext()) return "Invalid N";
            first.next();
        }

        // Move both 'first' and 'second' until 'first' reaches the end
        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int N = 2;
        System.out.println(findNthFromEnd(list, N));
    }
}
