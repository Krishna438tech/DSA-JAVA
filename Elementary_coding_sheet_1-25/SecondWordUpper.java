import java.util.Scanner;

public class SecondWordUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String line = sc.nextLine();

        String[] words = line.trim().split("\\s+");

        if (words.length < 2) {
            System.out.println("No second word exists!");
        } else {
            System.out.println(words[1].toUpperCase());
        }
    }
}
