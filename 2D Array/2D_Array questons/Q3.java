// package java.2D Array.2D_Array questons;
// 25.	Write a Java program to perform Scalar matrix multiplication.
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt(); 
        int[][] arr1 = new int[n][m];
        int mul = sc.nextInt();
        for (int i =0;i <n; i++) {          
            for (int j= 0;j <m;j++) {   
                arr1[i][j]= sc.nextInt();
            }
        }
        if(n != m){
            System.out.println("Not a scalar matrix");
            return;
        }
        int diag = arr1[0][0];
        for(int i =0;i<n;i++){
            for(int j =0;j< m;j++){
                if((i == j && arr1[i][j] != diag)||(i != j && arr1[i][j] != 0)){
                    System.out.println("Not a scalar matrix");
                    return; 
                }
            }
        }
        for(int i=0;i<n; i++){
            for(int j =0;j<m; j++){
                arr1[i][j] =arr1[i][j]* mul;
            }
        }
        for(int i = 0; i<n;i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
