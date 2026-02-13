// package basics;
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// // it is automaticlly convert INT into FLOAT
//         float num = input.nextFloat();
//         // float num = input.nextInt(); // this is also work for an float
//         // int num = input.nextFloat();  
//         System.out.println(num);

// //if you are asking for integer and giving float value that is not work,
// // but if you are asking for a float vaue and giving integer is working,
// // because we know that the float  are GreaterThen the integer because in integer 
// // we can add only integers values but in float we can add the integer and decimal value as well
// // basiclly if you ask for smaller and give bigger then it is not work and if you are asking for bigger and give smaller then it is work

// // converting FLOAT into INT   => it is called typecasting ->compress a bigger number in a smaller type "explictly"
//         int num1 = (int)(67.56f);
//         System.out.println(num1);

// automatic type promation in expressions
        // int a = 257;  // 1-byte  range is -> 256
        // byte b = (byte)(a);  // the range of byte is 256 but we store 257 so this done remainder(257 % 256 =1(output in this case))
        // System.out.println(b);

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int d = (a*b)/c; // this expression is performing using integer not bytes evethough a and b are bytes so it handle the (40*50= 2000 bytes but we can store only 256 in a byte so that is happen)
        // System.out.println(d);

        // byte b = 50;
        // b = b * 2;  // not performing this because b is a byte (whenever we perform these byte evaluation it automatically convert into integers and sicence it is an integer now so we cannot assign this to a byte now)

        // int number = 'A';  // ASCII value concept
        // System.out.println(number);

        // System.out.println(3*6); // int*int => int
        // System.out.println(3*5.43574378f);  // int*float = > float


    // example to calrify all these things
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b) + (i/c) - (d*s);
        System.out.println((f*b) + " " + (i/c) + " " +  (d*s));
        // float + int - double => "double"(all are converting into bigger one)
        System.out.println(result);

    }
}
