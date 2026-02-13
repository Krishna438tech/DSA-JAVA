// wap a java program sum of 3 digit number without using conditionals and control sataements

import java.util.Scanner;

public class sum_of_3_digitNO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int d1 = num / 100;         
        int d2 = (num / 10) % 10;         
        int d3 = num % 10;

        int sum = d1 + d2 + d3;        
        System.out.println("sum of digits = " + sum);
    }
}

