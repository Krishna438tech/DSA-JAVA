
public class LastDigit {
    public static int lastDigit(int n) {
        return Math.abs(n % 10);   // handles negative numbers also
    }

    public static void main(String[] args) {
        int n = 987;
        System.out.println("Last digit: " + lastDigit(n));
    }
}
