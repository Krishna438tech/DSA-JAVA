import java.util.Scanner;

public class krishna { 
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int fact = 1;
    int i =1; 
    do{
        i++;
        fact *=i;
    } while (i<=n);
            System.out.println(fact);
        }
    }