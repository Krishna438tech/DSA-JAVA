public class String_Builders {
    public static void main(String[] args) {

        // StringBuilder create
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");         // End me text add
        System.out.println(sb);

        System.out.println(sb.charAt(1));  // Index ka character

        sb.setCharAt(0, 'Y');     // Character change
        System.out.println(sb);

        sb.insert(5, " Java");     // Beech me insert
        System.out.println(sb);

        // Ek character delete
        sb.deleteCharAt(0);
        System.out.println(sb);

        sb.delete(0, 4);         // Range delete, end index excluded
        System.out.println(sb);

        sb.replace(0, 4, "Hi");      // Text replace
        System.out.println(sb);

        // Total length
        System.out.println(sb.length());

        System.out.println(sb.substring(0, 2));       // Part of string

        // Word ka index
        System.out.println(sb.indexOf("World"));

        sb.reverse();           // Reverse
        System.out.println(sb);

        // StringBuilder to String
        String result = sb.toString();
        System.out.println(result);
    }
}
