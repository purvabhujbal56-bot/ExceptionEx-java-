//example of collection type (queue and Dequee)

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
   public static void main(String[] args) {

    Queue<String> que = new LinkedList<String>();
    que.offer("apple");
    que.offer("banana");
    que.offer("cherry");

    //fetch value but doesn't remove
    System.out.println(que.peek());

    while (!que.isEmpty()) {
        //fetch value and remove from queue
        System.out.println(que.poll());
    }
    //write code to implement dequeue in this example
    Deque<String> dq = new LinkedList<String>();

    dq.add("Alfa");
    dq.add("Beta");
    dq.add("Gama");

    while (!dq.isEmpty()) {
        System.out.println(dq.pollLast());
    }
   } 
}
