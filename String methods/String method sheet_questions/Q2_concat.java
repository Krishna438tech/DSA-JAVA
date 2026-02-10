// package String methods.String method sheet_questions;

import java.util.Scanner;

public class Q2_concat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        String str2 = str.concat(str1);
        System.out.println(str2);
        // // space add karke concat
        // String str2 = str.concat(" ").concat(str1);

        // System.out.println(str2);
    }
   
}
