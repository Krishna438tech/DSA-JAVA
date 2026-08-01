public class method {

    // main() method se program start hota hai
    public static void main(String[] args) {

        System.out.println("Program Start");

        // Method ko call kar rahe hain
        printMessage();

        // greetUser method ko value pass kar rahe hain
        greetUser("Krishna");

        // addNumbers method do numbers lega
        addNumbers(10, 20);

        // getSum method result return karta hai
        int answer = getSum(50, 30);

        // Returned value ko print kar rahe hain
        System.out.println("Returned Sum = " + answer);

        System.out.println("Program End");
    }


    // 1. Simple method
    // Ye method koi value receive nahi karta
    // Ye method koi value return bhi nahi karta
    public static void printMessage() {

        System.out.println("Hello! Ye ek simple method hai.");
    }


    // 2. Method with parameter
    // String name ek parameter hai
    // Method call karte time name ki value deni hogi
    public static void greetUser(String name) {

        System.out.println("Hello " + name);
        System.out.println("Welcome to Java Methods");
    }


    // 3. Method with multiple parameters
    // int number1 aur int number2 parameters hain
    public static void addNumbers(int number1, int number2) {

        int sum = number1 + number2;

        System.out.println("Sum = " + sum);
    }


    // 4. Method with return value
    // int ka matlab ye method integer value return karega
    public static int getSum(int number1, int number2) {

        int sum = number1 + number2;

        // return method ka result wapas bhejta hai
        return sum;
    }
}