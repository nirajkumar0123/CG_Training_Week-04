package queueinterface.genbinarynumqueue;

import java.util.LinkedList;
import java.util.Queue;

public class GenBinaryNumUsingQueue {
    public static void generateBinaryNumbers(int n){
        Queue<String> queue = new LinkedList<>();

        queue.add("1");

        for(int i = 0; i < n; i++){
            String curr = queue.poll();
            System.out.print(curr + " ");

            queue.offer(curr + "0");
            queue.offer(curr + "1");
        }

    }
    public static void main(String[] args) {
       generateBinaryNumbers(5);
    }
}
