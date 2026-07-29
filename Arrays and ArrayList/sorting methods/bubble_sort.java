//arrange elments in ascending or descending order in java by repeatedly swapping adjacent elements.
// import java.util.Arrays;
// public class Bubble_Sort {
//     public static void main(String[] args) {
//         int[] arr = {5,4,3,2,1};
//         // int[] arr = {1,2,3,4,5};
//         BubbleSort(arr);
//         System.out.println(Arrays.toString(arr));

//     }
//     static void BubbleSort(int[] arr){
//         boolean swapped;
//         //run the steps n-1 times
//         for(int i = 0; i < arr.length; i++){
//             swapped = false;
//             //for each step,max item will come at the last respective index
//             for(int j = 1; j < arr.length - i; j++){
//                 //swap if the item is smaller then the previous(i.e: j-1)
//                 if(arr[j]<arr[j-1]){
//                     //swap
//                     int temp =arr[j];
//                     arr[j] = arr[j-1];
//                     arr[j-1] = temp;
//                     swapped=true;
//                 }
//             }
//             //if you did not swap for a particular value of i 
//             //,it means the arr is sorted hence stop the program
//              if(!swapped){  //!false = true
//                 break;
//              }
//         }
//     }
// }


import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1 ; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}

// import java.util.Arrays;
// public class Bubble_Sort {
//     public static void main(String[] args) {
        

//     }
    
// }