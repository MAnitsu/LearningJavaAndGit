package DataStructures;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    public static void main(String[] args) {
        /*
        Priority queues = FIFO data structure that serves elements
                          with the highest priorities first
                          before elements with lower priority
         */

        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while(!queue.isEmpty()) {
            System.out.println(queue.poll()); // prints the elements in ascending order,
                                              // if descending order is need use the parameter Collections.reverseOrder()
                                              // while creating the queue object
                                              // if the input is a string the items will be displayed in alphabetical order
        }
    }
}
