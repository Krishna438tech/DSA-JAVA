import java.util.Scanner;

public class PrimesInRange {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i*i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = sc.nextInt();
        System.out.print("Enter end: ");
        int end = sc.nextInt();

        int count = 0;

        for (int i = start; i <= end; i++)
            if (isPrime(i)) count++;

        System.out.println("Number of primes in range = " + count);
    }
}
