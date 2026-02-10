// Q: Write a Java program to print the Fibonacci series up to n terms.
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// for print the series   

        // int n = sc.nextInt();
        // int a =0;
        // int b =1;
        // int c =0;
        // for(int i=0;i<=n;i++){
        //     System.out.print(a+" ");
        //     c=a+b;
        //     a=b;
        //     b=c;
        // }

// Q. find the nth fibo. no. in the series

        int n = sc.nextInt();
        int a = 0, b = 1, c = 0;

        if (n == 0){
            System.out.print(0);
        }
        else{
            for(int i = 1; i <= n; i++){
                c = a + b;
                a = b;
                b = c;
            }
        System.out.print(a);
        }
    }
}
