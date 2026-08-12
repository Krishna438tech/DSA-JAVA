public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        quickSort(arr, 0, arr.length - 1);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    // Quick Sort function
    static void quickSort(int[] arr, int low, int high) {
        if(low >= high){
            return; // One element
        }

        int start = low;
        int end = high;
        // Middle element as pivot
        int pivot = arr[(low + high) / 2];
        
        while(start <= end){
            while(arr[start] < pivot){
                start++;
            }
            while(arr[end] > pivot){
                end--;
            }
            if(start <= end){
                // Swap
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }
        // Sort left part
        quickSort(arr, low, end);

        // Sort right part
        quickSort(arr, start, high);
    }
}