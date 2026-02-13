// package Taking_Input;
import java.util.Scanner;

public class int_and_float_inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // int a = 234_000_000; // it's "called literals(10 jo hai)"" and "a is an identifier"
        // System.out.println(a);

        System.out.print("enter the float number : ");
        float marks = input.nextFloat();
        System.out.println("the value is "+ marks);
        
    }
}
