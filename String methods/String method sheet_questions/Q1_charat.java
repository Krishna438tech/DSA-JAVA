// package java.String methods.String method sheet_questions;

import java.util.Scanner;

public class Q1_charat {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Character at index 0: " + str.charAt(0));
        System.out.println("Character at index 3: " + str.charAt(3));
        // for (int i = 0; i < str.length(); i++) {
        //     System.out.println(str.charAt(i) + " ");
        // }
    }
}
