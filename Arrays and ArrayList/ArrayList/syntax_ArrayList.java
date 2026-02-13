import java.util.ArrayList;
import java.util.Scanner;

public class syntax_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(4);
        list.add(67);
        list.add(694896);
        list.add(9);
        list.add(8);
        list.add(64646);
        list.add(533);
        list.add(46547);
        list.add(65);
        list.add(5);
        list.add(6);
        list.add(77); // add as many you want 
        // in array list we can direct print the arraylist
        System.out.println(list);   
        // arraylist functions
        System.out.println(list.contains(6));
        System.out.println(list.contains(5434));

        list.set(0, 1);   //for updating
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        // by for loop
        int n = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        // we use "list1.size()"  on the postion of "arr.length beacyse arraylist do not have a fixed size   
        // and importand // list1.size() is used AFTER input, not DURING input loop like we do not used in input loop
        for (int i = 0; i < n; i++) {    // or (int i = 0; i < n; i++)
            list1.add(sc.nextInt());
        }
        System.out.println(list1);   
        
        // we can use list1.size() for printing the elemnts
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }

    }
}
