import java.util.ArrayList;
import java.util.Collection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("New York");
        collection.add("San Francisco");
        collection.add("British Columbia");
        //for each is a method that you can use that uses an arrow function or anon function
        //this means that you do not have to have a method name to execute

        collection.forEach(city -> System.out.println(city));


    }
}