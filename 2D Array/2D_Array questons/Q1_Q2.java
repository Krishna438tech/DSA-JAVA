// package java.2D Array.2D_Array questons;
import java.util.Scanner;

public class Q1_Q2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt(); 
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        // int[][] sum  = new int[n][m];
        for(int i =0;i <n; i++){          
            for(int j= 0;j <m;j++){   
                arr1[i][j]= sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j =0;j <m;j++){
                arr2[i][j] =sc.nextInt();
            }
        }
        //23.	Write a Java program to add two matrices

        // //add loop
        // for(int i = 0; i < n; i++){
        //     for(int j=0;j< m; j++){
        //         sum[i][j] = arr1[i][j]+ arr2[i][j];
        //     }
        // }
        // //for printing the sum
        // for(int i = 0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.print(sum[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // 24.	Write a Java program to subtract two matrices

        //sub loop
        int[][] sub  = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j=0;j< m; j++){
                sub[i][j] = arr1[i][j]- arr2[i][j];
            }
        }
        //for printing the sub.
        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(sub[i][j]+" ");
            }
            System.out.println();
        }

    }
}
