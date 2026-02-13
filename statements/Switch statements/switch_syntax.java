//package Switch statements;

public class switch_syntax {
    public static void main(String[] args) {
        int day = 2;
        switch(day){
            case 1: System.out.println("monday");
            case 2: System.out.println("tuesday");
            case 3: System.out.println("wednesday");
            case 4: System.out.println("thursady");
            case 5: System.out.println("friday"); break;
            case 6: System.out.println("saturday");
            case 7: System.out.println("sunday");
            default: System.out.println("Invalid Day");
        }
    }
}
