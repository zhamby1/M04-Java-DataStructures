import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        //queue is opposite first in first out
        //queue is the building block to linked and array lists
        Queue<String> queue = new LinkedList<>();
        //offer returns true if it can and false if it cant
        System.out.println(queue.offer("Customer1"));
        System.out.println(queue.offer("Customer2"));
        System.out.println(queue.offer("Customer3"));


        while (!queue.isEmpty()) {
            System.out.println(queue.poll());

        }
        System.out.println(queue);

        //Priority queue returns things based on priority and access things with most priority when using peek

        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        pQueue.add(10);
        pQueue.add(15);
        pQueue.add(30);
        pQueue.add(20);

        System.out.println(pQueue);

        System.out.println(pQueue.stream().max(Integer::compareTo).get());


        System.out.println(pQueue.peek());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.peek());

        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");

        System.out.println(pq);



    }



}