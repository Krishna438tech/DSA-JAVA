public class String_Builders {
    public static void main(String[] args) {

        // StringBuilder create
        StringBuilder sb = new StringBuilder("Hello");

        // End me text add
        sb.append(" World");
        System.out.println(sb);

        // Index ka character
        System.out.println(sb.charAt(1));

        // Character change
        sb.setCharAt(0, 'Y');
        System.out.println(sb);

        // Beech me insert
        sb.insert(5, " Java");
        System.out.println(sb);

        // Ek character delete
        sb.deleteCharAt(0);
        System.out.println(sb);

        // Range delete, end index excluded
        sb.delete(0, 4);
        System.out.println(sb);

        // Text replace
        sb.replace(0, 4, "Hi");
        System.out.println(sb);

        // Total length
        System.out.println(sb.length());

        // Part of string
        System.out.println(sb.substring(0, 2));

        // Word ka index
        System.out.println(sb.indexOf("World"));

        // Reverse
        sb.reverse();
        System.out.println(sb);

        // StringBuilder to String
        String result = sb.toString();
        System.out.println(result);
    }
}
