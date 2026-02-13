import java.util.Scanner;

public class calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        calculator calc = new calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int x = sc.nextInt();

        System.out.println("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.println("Enter second number: ");
        int y = sc.nextInt();

        switch (op) {
            case '+': System.out.println("Result: " + calc.add(x, y)); break;
            case '-': System.out.println("Result: " + calc.subtract(x, y)); break;
            case '*': System.out.println("Result: " + calc.multiply(x, y)); break;
            case '/': System.out.println("Result: " + calc.divide(x, y)); break;
            default: System.out.println("Invalid operator");
        }

        sc.close();
    }
}