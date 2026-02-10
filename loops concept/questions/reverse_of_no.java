import java.util.Scanner;

public class reverse_of_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int count = 0;
        while(n>0){
            int last = n%10;
            n = n/10;
            count = count*10+last;
        }
        System.out.println(count);
    }
}
