import java.util.Scanner;

public class DigitSumOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.print("Enter 1 for Even sum, 2 for Odd sum: ");
        int choice = sc.nextInt();

        int sum = 0;

        while (n != 0) {
            int d = n % 10;

            if (choice == 1 && d % 2 == 0)
                sum += d;

            if (choice == 2 && d % 2 != 0)
                sum += d;

            n /= 10;
        }

        System.out.println("Result = " + sum);
    }
}
