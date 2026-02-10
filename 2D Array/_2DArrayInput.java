import java.util.Arrays;
import java.util.Scanner;

public class _2DArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[][] arr = {
        //         {1,2,3},   // 0th index
        //         {4,5},     // 1st index
        //         {6,7,8,9}   // 2nd index -> arr[2] = {6,7,8,9}
        // };    


        int[][] arr = new int[3][3];
        System.out.println(arr.length);   // give no. of rows
        //input
        for (int row = 0; row < arr.length; row++) {
            //for each col.in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt(); 
            }
        }
        // print by for-loops
        // for (int row = 0; row < arr.length; row++) {
        //     //for each col.in every row
        //     for (int col = 0; col < arr[row].length; col++) {
        //         System.out.print(arr[row][col] + " "); 
        //     }
        //     System.out.println();
        // }

        // print by toString(arr)
        // for (int row = 0; row < arr.length; row++) {
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        //print by enhanced for loop
        for (int[] a : arr) {     //in this dataype is array so we use  int[] a  this 
            System.out.println(Arrays.toString(a));    // a is representing the elements of array and they are already array so we use int[] a
        }

    }
}
