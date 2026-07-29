import java.util.Scanner;

public class MaxOfThreeBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // System.out.println(Math.max(Math.max(a, b), c));


        //for 4 numbers i.e: "MaxOfFourBuiltIn"
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(Math.max(Math.max(a, b), Math.max(c, d)));

    }
}
