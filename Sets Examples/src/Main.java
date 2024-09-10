import java.util.*;
public class Main {
    public static void main(String[] args) {
        //set is a collection of items with non-duplicates (items cannot be the same in set)
        Set<String> set = new HashSet<>();
        //add strings to set
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");


        set.forEach(city -> System.out.println(city));
        set.remove("San Francisco");
        System.out.println(set);

        //linkedHashSets are inserted in LIFO order, Hashsets do not guarentee order

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("London");
        linkedHashSet.add("Paris");
        linkedHashSet.add("New York");
        linkedHashSet.add("San Francisco");

        System.out.println(linkedHashSet);

        linkedHashSet.forEach(city2 -> System.out.println(city2));

        //TreeSet is a sorted st that guarantees the elements are sorted
        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println(treeSet);
        System.out.println("lower(\"P\"): " + treeSet.lower("P"));
        System.out.println("higher(\"P\"): " + treeSet.higher("P"));
        System.out.println("floor(\"P\"): " + treeSet.floor("P"));
        System.out.println("ceiling(\"P\"): " + treeSet.ceiling("P"));
        System.out.println("pollFirst(): " + treeSet.pollFirst());
        System.out.println("pollLast(): " + treeSet.pollLast());
        System.out.println("New tree set: " + treeSet);






    }
}