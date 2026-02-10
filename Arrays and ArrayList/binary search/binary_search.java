// package Arrays and ArrayList.binary search;
//use karte hai jab data "sorted mai ho" and "data bahut large amount mai ho"
// time complextiy "O(logn)"" hoti hai beacuse data sorted mai hota hai
//mid (element) = start + (end-start)/2
import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans = binary_search(arr, target);
        System.out.println(ans);
    }

    //retrun the index
    static int binary_search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

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

//without function
// import java.util.Scanner;

// public class binary_search {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int target = sc.nextInt();

//         int start = 0;
//         int end = arr.length - 1;
//         int ans = -1;

//         if (arr.length == 0) {
//             System.out.println(-1);
//             return;
//         }

//         while (start <= end) {
//             int mid = start + (end - start) / 2;

//             if (target < arr[mid]) {
//                 end = mid - 1;
//             }
//             else if (target > arr[mid]) {
//                 start = mid + 1;
//             }
//             else {
//                 ans = mid;
//                 break;
//             }
//         }

//         System.out.println(ans);
//     }
// }
