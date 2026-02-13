package patterns1;

import java.util.Scanner;

public class pattern_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int c = 2*n+1; // number of columns

        for (int i=1;i<=n;i++) {
            for (int j=1;j<=c;j++) {
                if (i==(n+1)/2) {
                    // Middle row: print all stars
                    System.out.print(" *");
                } 
                else if ((i==1 || i==n)&&(j==1 || j==(2*n-1))) {
                    // First and last row: stars at col 1 and col (2n-1)
                    System.out.print(" *");
                } 
                else if ((i>1 && i<n) && (j==1 || j==(2*n-1) || j==(2*n))) {
                    // Middle rows (except center): stars at col 1, col (2n-1), col (2n)
                    System.out.print(" *");
                } 
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}