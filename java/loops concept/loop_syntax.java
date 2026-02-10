import java.util.Scanner;
public class loop_syntax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// for loops  => generally used when you know that you how that how many time that loop will be run

        // //print numbers from 1 to 5
        // for(int i=1;i<=5;i++){
        //     System.out.println(i);
        // }

        // //print number s from 0 to n
        // System.out.print("the the value of n : ");
        // int n = input.nextInt();
        // for(int i=0;i<=n;i++){
        //     System.out.println(i);
        // }


//while loops  => generally use when you do not know that "how many times the loop is run"
        System.out.print("enter the value of n : ");
        int n = input.nextInt();
        int i = 0;
        while(i<=n){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
}