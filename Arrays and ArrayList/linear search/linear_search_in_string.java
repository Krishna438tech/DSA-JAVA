import java.util.Scanner;

public class linear_search_in_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        char target = sc.next().charAt(0);
        // String name = "kunal";
        // char target = 'u';
        boolean ans = search(name, target);
        System.out.println(ans);
        // System.out.println(search(name, target));
        System.out.println(search1(name, target));
    }
    static boolean search(String name, char target ){
        if(name.length() == 0){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if(target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static boolean search1(String str, char target ){
        if(str.length() == 0){
            return false;
        }
        for (char ch : str.toCharArray()) {    // pahle string ko ['k','u','n','a','l']  esmai change kar liya this is a method  
            if(ch == target){
                return true;
            }   
        }
        return false;
    }
}

// import java.util.Arrays;

// public class linear_search_in_string{
//     public static void main(String[] args) {
//         String name = "kunal";
//         System.out.println(Arrays.toString(name.toCharArray()));
//     }
// }