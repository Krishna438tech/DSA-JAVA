// package Taking_Input;
import java.util.Scanner;

public class SumOfTwoNo {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("enter the values of num1 and num2 : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        int sum = num1+num2;
        System.out.println("sum = "+sum);
        System.out.println("the sum of num1 and num2 is : "+sum);
        

    }
}
