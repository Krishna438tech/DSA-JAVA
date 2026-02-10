import java.util.HashSet;
import java.util.Set;
public class main {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Banana");

        // Display the Set
        System.out.println("Fruits in Set (unique only):");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        // Show total number of unique items
        System.out.println("\nTotal unique fruits: " + fruits.size());
    }
}

