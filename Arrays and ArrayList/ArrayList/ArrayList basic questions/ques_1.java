// package ArrayList basic questions;

import java.util.ArrayList;
import java.util.Scanner;

public class ques_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            list1.add(sc.nextInt());
        }
    }
}
