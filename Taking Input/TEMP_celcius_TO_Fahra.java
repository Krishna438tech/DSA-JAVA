// package Taking_Input;
import java.util.Scanner;

public class TEMP_celcius_TO_Fahra {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the temp. in celcius : ");
        float tempC = input.nextFloat();
        float tempF = (tempC * 9/5) + 32;     
       // float tempF = (tempC * (9.0f/5.0f)) + 32;    // operator presendence matter here 9/5 is integer division (both are integers), so it evaluates to 1, not 1.8. that why we add 5.0f and in upeer case it differewnt there arew not bracets
        System.out.print("the value of temp. in Fahrenheit : " + tempF);
    }
}