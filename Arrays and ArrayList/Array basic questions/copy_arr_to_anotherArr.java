import java.util.Scanner;

public class copy_arr_to_anotherArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr_copy = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr_copy[i] = arr[i];
            // System.out.print(arr_copy[i] + " ");
        }
        System.out.println("arr_copy is: ");
        for (int i = 0; i < arr_copy.length; i++) {
            System.out.print(arr_copy[i] + " ");
        }
    }
}
