import java.util.Scanner;

public class negative_int_print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {23,56,-2,-3,6,-7};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
