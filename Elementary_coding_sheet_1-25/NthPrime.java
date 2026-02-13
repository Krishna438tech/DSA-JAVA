import java.util.Scanner;

public class NthPrime {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i*i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int count = 0, num = 1;

        while (count < n) {
            num++;
            if (isPrime(num)) count++;
        }

        System.out.println(n + "th Prime Number is: " + num);
    }
}
