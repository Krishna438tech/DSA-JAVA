import java.util.Scanner;

public class EncodeThreeStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        int maxLength = Math.max(s1.length(), Math.max(s2.length(), s3.length()));
        StringBuilder encoded = new StringBuilder();

        for (int i = 0; i < maxLength; i++) {
            if (i < s1.length()) encoded.append(s1.charAt(i));
            if (i < s2.length()) encoded.append(s2.charAt(i));
            if (i < s3.length()) encoded.append(s3.charAt(i));
        }

        System.out.println(encoded.toString());
    }
}

