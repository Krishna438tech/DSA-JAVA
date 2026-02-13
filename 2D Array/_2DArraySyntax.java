// package 2D Array;

public class _2DArraySyntax {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9 
        */
       //syntax
       int[][] arr = new int[3][3];       //no. of columns is is not neecerry to specify them "1st [] is rows size and it is mandaterory", "2nd [] is for column size it is ot mandaterory"
       
        int[][] arr1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        }; 

        // the reason why coloumns size is not nessary 
        int[][] arr2 = new int[3][];
        int[][] arr3 = {
                {1,2,3},   // 0th index
                {4,5},     // 1st index
                {6,7,8,9}   // 2nd index -> arr3[2] = {6,7,8,9}
        };                  // arr3[2][0]  = 6

    }
}
