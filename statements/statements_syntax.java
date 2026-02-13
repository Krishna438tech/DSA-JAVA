package statements;
public class statements_syntax {
    public static void main(String[] args) {
        int salary = 25400;
        // if(salary>10000){
        //     salary =  salary +2000;
        // }
        // else{
        //     salary = salary +1000;
        // }
        // System.out.println(salary);

        // mutiple if-else sataements
        if(salary>20000){       //agar ye conditio true hai toh aage vali sab condition check hi nahi hongi
            salary+=2000;
        }
        else if(salary>10000){
            salary+=3000;
        }
        else{
            salary+= 1000;
        }
        System.out.println(salary);
    }
}   