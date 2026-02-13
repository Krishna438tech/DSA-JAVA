// package Taking_Input;
import java.util.Scanner;

public class scanner_class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt());  // for input specficlly an integer

        System.out.println(input.next());  // for input a string and a integer in the form of string  and mix also
        // and input.next print only first word string if we input a 10-15 words line

        input.nextLine();     // very important role 
        
        System.out.println(input.nextLine()); // if we want to print entire input line

    }
}

