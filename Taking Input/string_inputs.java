// package Taking_Input;
import java.util.Scanner;

public class string_inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.next();
        System.out.println(name);
          
        input.nextLine(); //very important role
        // hello world this is java input.next() → will only read "hello" The scanner cursor stops right after hello
        // but the rest " world this is java\n" is still in the buffer  input.nextLine(); 
        //This line consumes the leftover part of the current line after hello It reads " world this is java" and throws it away (not stored)
        // Cursor moves to the end of the line (right after \n)  Without this line, 
        //the next nextLine() would immediately return the leftover " world this is java", instead of waiting for new user input 
        // System.out.println(input.nextLine()); | Now, since the buffer is empty and cursor is at a fresh line
        // It waits for you to type a new full line  Whatever you type (e.g. "I love programming") will be printed.

        String my_name = input.nextLine();
        System.out.println(my_name);
        
    }

}

