// package java.loops concept.questions;
import java.util.Scanner;
public class largest_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // int  max = a;
        // if (b > max) {
        //     max = b;
        // }
        // if (c > max) {
        //     max = c;
        // }
        // System.out.println(max + " is the largest number");
        
        // int max = Math.max(a, b);
        // max = Math.max(max, c);
        // System.out.println(max + " is the largest number");

        int max  = Math.max(c, Math.max(a, b));
        System.out.println(max + " is the largest number");

        // if (a >= b && a >= c) {
        //     System.out.println(a + " is the largest number");
        // } else if (b >= a && b >= c) {
        //     System.out.println(b + " is the largest number");
        // } else {
        //     System.out.println(c + " is the largest number");
        // }
    }
}
