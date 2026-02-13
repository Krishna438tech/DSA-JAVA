import java.util.Scanner;

public class LastDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Get last digits using % 10
        int lastDigitA = a % 10;
        int lastDigitB = b % 10;

        // Sum of last digits 
        int sum = lastDigitA + lastDigitB;

        // Output
        System.out.println("Sum of last digits = " + sum);
    }
}
