package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        /*
        Queue = FIFO data structure. First-In First-Out (ex. A line of people)
                A collection designed for holding elements prior to processing
                Linear data structure

                add    = enqueue, offer()
                remove = dequeue, poll()

                Queue is an interface, so you won't be able to create an object of Queue, so we will use Linked Lists
         */

        Queue<String> queue = new LinkedList<String>();

        System.out.println("Is the queue empty? " + queue.isEmpty()); // checks if the queue is empty

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println("Is the queue empty? " + queue.isEmpty()); // checks if the queue is empty

        System.out.println("Queue size: " + queue.size()); // prints the size of the queue

        System.out.println("Is Harold in the queue? " + queue.contains("Harold")); // checks if the queue contains Harold

        System.out.println("Who is first in the queue? " + queue.peek()); // prints the first item without removing it

        queue.poll(); // removes the first item from the queue
        queue.poll();

        System.out.println(queue);

        /*
        uses of queues:
        1. Keyboard buffer (letters should appear on the screen in the order they're pressed)
        2. Printer queue (print jobs should be completed in order)
        3. Used in LinkedLists, PriorityQueues, Breadth-first search
         */
    }
}
