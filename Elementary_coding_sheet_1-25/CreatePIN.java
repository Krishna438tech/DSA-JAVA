import java.util.Scanner;

public class CreatePIN {
    public static int smallestDigit(int n) {
        int min = 9;
        while (n != 0) {
            int d = n % 10;
            if (d < min) min = d;
            n /= 10;
        }
        return min;
    }

    public static int largestDigit(int n) {
        int max = 0;
        while (n != 0) {
            int d = n % 10;
            if (d > max) max = d;
            n /= 10;
        }
        return max;
    }

    public static int middleDigit(int n) {
        int[] freq = new int[10];
        while (n != 0) {
            freq[n % 10]++;
            n /= 10;
        }
        // Return the first digit that is neither smallest nor largest
        for (int i = 0; i < 10; i++)
            if (freq[i] > 0) return i;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Alpha: ");
        int a = sc.nextInt();

        System.out.print("Enter Beta: ");
        int b = sc.nextInt();

        System.out.print("Enter Gamma: ");
        int c = sc.nextInt();

        int pin = smallestDigit(a) * 100 + middleDigit(b) * 10 + largestDigit(c);

        System.out.println("Generated PIN = " + pin);
    }
}
