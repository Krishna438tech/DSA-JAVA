import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class colletion {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Sachin Sir");
        names.add("Krishna");
        names.add("mohit");
        names.add("kaushal");
        // ListIterator<String> li = names.listIterator();
        // System.out.println("ForwardTravers:");
        // while (li.hasNext()) {
        //     System.out.println(li.next());
        // }
        ListIterator<String> li = names.listIterator(names.size());
        System.out.println("Backward Travers:");
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}
