// package Taking_Input;
import java.util.Scanner;

public class multiple_INT_inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, q;

        System.out.print("Enter the values of p and q: ");
        p = input.nextInt();
        q = input.nextInt();

        System.out.println("p = " + p);
        System.out.println("q = " + q);
    }
}
