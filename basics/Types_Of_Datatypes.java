// package basics;
public class Types_Of_Datatypes {
    public static void main(String[] args) {

        int rollno = 84;  // Int is primitive ,primitive means "the last datatype" which cannot break in any other datatype
        System.out.println(rollno);

        String name = "krishna";  // string is not primitive because string is breakable into "char datatype"
        System.out.println(name);

        char letter = 'k';  // char is an primitive
        System.out.println(letter);

        float marks = 98.67f;  // add "f" in the last of value Because without f, Java assumes it’s a double, and assigning a double to a float without casting 
        System.out.println(marks); //because double have more prision(64-bit) as comapre to float(32-bit) To avoid confusion, Java requires the f.

        double a = 7848935.437574;  // double is used for store "large decimal numbers"
        System.out.println(a);

        long b = 75893475734798534L;  // long is used for "large integer values"  add "L" in the last of value
        System.out.println(b);
        // Gyann : by defult if we are not adding point or anything the value is the type of "Int" to specifiy we add "L" over here for "larger interger values" 
    
        boolean check = true;  // or false 
        System.out.println(check);
    
    }
}
