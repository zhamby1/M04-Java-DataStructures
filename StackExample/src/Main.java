import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        //stack is first in last out.  Think deck of cards
        Stack<String> stack = new Stack<>();
        //push adds things to stack
        stack.push("Ace");
        stack.push("Queen");
        stack.push("King");


        while (!stack.isEmpty()) {

            //pop reads AND deletes from stack
            System.out.println(stack.pop());
        }

        //stack is now empty because of pop

        boolean isitempty = stack.isEmpty();
        System.out.println(isitempty);

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


    }
}