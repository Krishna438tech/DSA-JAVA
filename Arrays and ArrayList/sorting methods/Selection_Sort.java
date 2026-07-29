// public class Selection_Sort {
//     public static void main(String[] args) {
        
//     }
//     static void SelectionSort(int[] arr){
        
//     }
// }

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        SelectionSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            // Find the index of the smallest element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the smallest element with the current element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}