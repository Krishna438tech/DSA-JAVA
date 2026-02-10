import java.util.Arrays;
import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        // arr[0] = 23;
        // arr[1] = 43;
        // arr[2] = 423;
        // arr[3] = 26;
        // arr[4] = 29;
        // [23,43,423,26,29]
        // System.out.println(arr[3]);
        // input using for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //printthe elmentrs of array
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        
        // // toString method  -> without for loop directly print
        System.out.println(Arrays.toString(arr));

        //enhanced for loop
        // for (int num : arr) {     //for every element in array, print the element
        //     System.out.print(num + " "); //here num represents the element of the array
        // }

        // System.out.println(arr[5]);  // index out of bound error

        // // array of objects
        // String[] str = new String[4];
        // for (int i = 0; i < str.length; i++) {
        //     str[i]=sc.next();
        // }
        // System.out.println(Arrays.toString(str));
        // //modify
        // str[1] = "krishna";
        // System.out.println(Arrays.toString(str));
    }
}
