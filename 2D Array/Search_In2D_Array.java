import java.util.Scanner;

public class Search_In2D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 3, cols = 3;
        int[][] arr = new int[rows][cols];

        System.out.println("Enter 9 elements:");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter target element: ");
        int target = sc.nextInt();
        boolean found = false;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++){
                if(arr[i][j] == target){
                    System.out.println("Found at row " + i + ", column " + j);
                    found = true;
                    break; //stop inner loop
                }
            }
            if(found) break; //stop outer loop
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}