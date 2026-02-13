import java.util.Scanner;

public class HillWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height of hill: ");
        int n = sc.nextInt();

        int weight = 0;

        for (int i = 1; i <= n; i++) {
            weight += i * i;
        }

        System.out.println("Total Weight of Hill = " + weight);
    }
}
