// package basics;
public class toggleCase {
    public String toggleCase(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result += (char)(c + 32); 
            } else if (c >= 'a' && c <= 'z') {
                result += (char)(c - 32); 
            } else {
                result += c; 
            }
        }
        return result;
    }

    public static void main(String[] args) {
        toggleCase tc = new toggleCase();
        String input = "Gla university";
        String output = tc.toggleCase(input);
        System.out.println(output); 
    }
}
