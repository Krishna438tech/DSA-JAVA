import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid Input!");
            return;
        }

        if (n == 1 || n == 2) {
            System.out.println("Fibonacci number at position " + n + " is: 1");
            return;
        }

        int a = 1, b = 1, fib = 1;

        for (int i = 3; i <= n; i++) {
            fib = a + b;  // next number
            a = b;        // shift forward
            b = fib;      // update last number
        }

        System.out.println("Fibonacci number at position " + n + " is: " + fib);
    }
}
