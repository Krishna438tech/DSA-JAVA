import java.util.Scanner;

public class UniqueDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[] freq = new int[10];

        int temp = n;
        while (temp != 0) {
            int d = temp % 10;
            freq[d]++;
            temp /= 10;
        }

        int unique = 0;
        for (int i = 0; i < 10; i++)
            if (freq[i] == 1) unique++;

        System.out.println("Unique Digits = " + unique);
    }
}
