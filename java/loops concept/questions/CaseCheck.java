// Q: Write a Java program that reads a single character and determines whether it is a lowercase letter, 
//uppercase letter, or not an alphabetic letter.
import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.println(in.next().trim());   
// trim() removes any leading or trailing whitespace, ie: that it removes any extra spaces before or after the character input

        char ch = in.next().trim().charAt(0);  
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase Letter");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase Letter");
        } else {
            System.out.println("Not an Alphabetic Letter");
        }
        System.out.println(ch);  
        
    }
}