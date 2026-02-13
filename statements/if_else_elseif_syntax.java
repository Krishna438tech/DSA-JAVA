package statements;

import java.util.Scanner;

public class if_else_elseif_syntax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        a = input.nextInt();
        if(a>=10){
            System.out.println("krishna");
        }
        else{
            System.out.println("krishna chaudhary");
        }

        // if(true){
        //     System.out.println("krishna");
        // }


        int money = input.nextInt();
        if(money>=50){           //agar ye conditio true hai toh aage vali sab condition check hi nahi hongi
            System.out.println("paratha");
        }
        else if(money>100){
            System.out.println("Tea Shop");
        }
        else{
        System.out.println("home food");
        }
    }
}
    
