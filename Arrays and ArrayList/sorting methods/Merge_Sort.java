public class Merge_Sort {

    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};

        mergeSort(arr, 0, arr.length - 1);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Divide the array
    static void mergeSort(int[] arr, int left, int right) {

        if (left >= right) {
            return; // One element is already sorted
        }

        int mid = (left + right) / 2;

        mergeSort(arr, left, mid);       // Left part
        mergeSort(arr, mid + 1, right);  // Right part

        merge(arr, left, mid, right);    // Merge both parts
    }

    // Merge two sorted parts
    static void merge(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        // Compare and store smaller element
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining left elements
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Copy remaining right elements
        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy back to original array
        for (int p = 0; p < temp.length; p++) {
            arr[left + p] = temp[p];
        }
    }
}