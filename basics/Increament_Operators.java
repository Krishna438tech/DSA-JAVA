// package basics;
public class Increament_Operators {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        //a++ is post-increment It prints first, then increments.
        System.out.println(a++);   //there is a logic so agian write these two line
        System.out.println(a++);
        System.out.println(a);
        // ++a is pre-increment It increments first, then print.
        System.out.println(++a);
        System.out.println(a++>a);
        System.out.println(a++<a);
    }
}
