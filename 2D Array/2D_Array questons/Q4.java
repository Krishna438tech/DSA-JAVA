// package java.2D Array.2D_Array questons;
// 26. Write a Java program to multiply two matrices.
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First matrix dimensions
        int n = sc.nextInt();   //row of first
        int m = sc.nextInt();   //col of first
        // Second matrix dimensions
        int p = sc.nextInt(); //col of second
        int[][] arr1= new int[n][m];
        int[][] arr2 =new int[m][p];
        int[][] mul =new int[n][p];
        for(int i = 0;i < n; i++){
            for(int j= 0; j< m;j++){
                arr1[i][j] =sc.nextInt();
            }
        }
        for(int i =0;i<m; i++){
            for (int j =0;j <p; j++){
                arr2[i][j] =sc.nextInt();
            }
        }
        for(int i = 0;i<n;i++){
            for(int j =0;j<p; j++){
                for(int k = 0; k< m; k++){
                    mul[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        for(int i=0;i <n;i++){
            for(int j=0;j <p;j++){
                System.out.print(mul[i][j] +" ");
            }
            System.out.println();
        }
    }
}

