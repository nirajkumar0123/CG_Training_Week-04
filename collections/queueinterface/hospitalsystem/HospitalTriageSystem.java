package queueinterface.hospitalsystem;

import java.util.*;

public class HospitalTriageSystem {

    public static void main(String[] args) {
        PriorityQueue<Patient> queue = new PriorityQueue<>();

        // Adding patients to the queue
        queue.offer(new Patient("John", 3));
        queue.offer(new Patient("Alice", 5));
        queue.offer(new Patient("Bob", 2));

        // Processing patients in order of severity
        while (!queue.isEmpty()) {
            System.out.println("Treating: " + queue.poll());
        }
    }
}
