import java.util.*;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList<String> linked_list = new LinkedList<>();
        linked_list.add("A");
        linked_list.add("B");
        linked_list.add("C");

        linked_list.forEach(element -> System.out.println(element));

        //i want to use an iterator and make it display the items backwards from added last to added first

        ListIterator iterator = linked_list.listIterator(linked_list.size());

        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");

        }



    }
}