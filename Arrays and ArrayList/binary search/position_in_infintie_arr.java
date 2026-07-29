//find the position of an element in a sorted array of infinite numbers
// so it is a infinte arr so we do not know the length of the arry 
import java.util.Scanner;
public class position_in_infintie_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){
        //first find the range
        //first start eith the box of size of 2
        int start = 0;
        int end = 1;
        //condition for the target to lie on the range
        while(target > arr[end]){
            int newStart = end +1;
            //double the box value
            //end = previous end +sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binary_search(arr, target,start,end);
    }
    static int binary_search(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        while(start<=end){
            // int mid = (start + end)/2;   // find the middle element, imp=>(migth be possible that"start + end" exceeds the range of int in java)
            int mid = start + (end-start)/2;   //learn this is the better way to find mid
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;       // find the answer
            }
        }
        return -1;
    }
}
