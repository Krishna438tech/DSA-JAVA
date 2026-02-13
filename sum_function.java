// package java.Function java;
import java.util.Scanner;
public class sum_function {
    public static void main(String[] args) {
        sum();
    }
 
    static void sum() {
        Scanner input = new Scanner(System.in);

        // int a = input.nextInt();
        // int b = input.nextInt();
        // int sum = a + b;
        // System.out.println(sum);

// sum of first n natural numbers
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);
    }
}

