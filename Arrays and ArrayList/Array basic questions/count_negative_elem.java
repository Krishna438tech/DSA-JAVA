import java.util.Scanner;

public class count_negative_elem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int neg_count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                neg_count++;
            }
        }
        System.out.println(neg_count);
    }
}
