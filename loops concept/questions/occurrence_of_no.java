import java.util.Scanner;

public class occurrence_of_no {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int count=0;
        while(n>0){
            int digit = n % 10;     // last digit milta hai
            if(digit==d){
                count++;
            }
            n=n/10;            //last digit hat jata hai 
        }
        System.out.println(count);
    }
}
