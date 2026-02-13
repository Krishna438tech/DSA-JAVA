//if we do not know array is sorted in assending or desending order
import java.util.Scanner;

public class order_Agnostic_binarySear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(order_agnostic_binarySearch(arr, target));
    }
    static int order_agnostic_binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        //find wheather the array is sorted in ascending or descending
        // boolean isAsc;
        // if(arr[start] < arr[end]){
        //     isAsc = true;
        // } else{
        //     isAsc = false;
        // }
        boolean isAsc = arr[start] < arr[end];     //intially we thought arr is in ascending so
        while(start<=end){
            int mid = start + (end-start)/2;  
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){    // true
                if(target < arr[mid]){
                    end = mid - 1;
                } else if(target > arr[mid]){
                    start = mid + 1;
                }
            } else{     // false i.e: arr[start] > arr[end]  => descending order
                if(target > arr[mid]){
                    end = mid - 1;
                } else if(target < arr[mid]){
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
