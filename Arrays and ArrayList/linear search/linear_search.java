// package java.Arrays and ArrayList.linear search;
// use karte hai jab mostly "unsorted data mai" sorted mai bhi kar sakte hai  and "data bahut kam amount mai ho" 
//best case ,average case ,worst caseki time complexity "O(n)" hoti hai 

import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int ans1 = linearsearch1(arr, target);
        int ans2 = linearsearch2(arr, target);
        boolean ans3 = linearsearch3(arr, target);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }

    //search in the array : return the index if item found
    //otherwise if item not found return -1
    static int linearsearch1(int[] arr, int target){
        if(arr.length ==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            //check for every element at every index if it is == target
            int element = arr[i];    // ye nahi bhi leenge tab bhi ho jayega extra variable hai bas
            if(element == target){
                return i;    // i -> indiacte index
            }
        }
        return -1;
    }

//search the target and return the element

    static int linearsearch2(int[] arr, int target){
        if(arr.length ==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == target){
                return element;    // us value ko print kar nai kai liye
            }
        }
        return -1;
    }
  
// serach the target and return TRUE and FALSE

static boolean linearsearch3(int[] arr, int target){
        if(arr.length ==0){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];    
            if(element == target){
                return true;  
            }
        }
        return false;
    }
}







// without use of of functions

// import java.util.Scanner;

// public class linear_search {
//     public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       int[] arr = new int[n];
//       for (int i = 0; i < arr.length; i++) {
//         arr[i] = sc.nextInt();
//       }
//       int target = sc.nextInt();
//       if(arr.length == 0){
//         System.out.println(-1);
//         return;
//       }
//       for (int i = 0; i < arr.length; i++) {
//         if(arr[i] == target){
//             System.out.println(i);   // for return the index
//             System.out.println(arr[i]);   // for returning that index value
//             return;    //jaise hi element mil gaya → print → bahar nikal jao
//         }
//       }
//       System.out.println(-1);
//     }
// }

