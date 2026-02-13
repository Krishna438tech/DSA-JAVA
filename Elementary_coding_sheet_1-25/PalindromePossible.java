import java.util.Scanner;

public class PalindromePossible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[] freq = new int[10];

        while (n != 0) {
            int d = n % 10;
            freq[d]++;
            n /= 10;
        }

        int oddCount = 0;
        for (int f : freq) {
            if (f % 2 != 0) oddCount++;
        }

        if (oddCount <= 1)
            System.out.println("Palindrome Possible");
        else
            System.out.println("Palindrome NOT Possible");
    }
}
