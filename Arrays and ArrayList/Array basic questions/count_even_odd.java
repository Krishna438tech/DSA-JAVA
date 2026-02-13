import java.util.Scanner;

public class count_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int even = 0;
        int odd  = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                even++;
            }
            if(arr[i]%2 != 0){
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
