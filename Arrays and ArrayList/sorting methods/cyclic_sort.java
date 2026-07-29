public class cyclic_sort {

    public static void main(String[] args) {

        // Unsorted array (Numbers should be from 1 to N)
        int[] arr = {3, 5, 2, 1, 4};

        // Function call to sort the array
        cyclicSort(arr);

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Function to perform Cyclic Sort
    static void cyclicSort(int[] arr) {

        // Start checking from index 0
        int i = 0;

        // Loop until we reach the end of the array
        while (i < arr.length) {

            // Find the correct index of the current element
            // Example: If value = 3, correct index = 2
            int correct = arr[i] - 1;

            // Check if current element is already at its correct position
            if (arr[i] != arr[correct]) {

                // If not, swap it with the element at its correct position
                swap(arr, i, correct);

            } else {

                // If yes, move to the next index
                i++;
            }
        }
    }

    // Function to swap two elements
    static void swap(int[] arr, int first, int second) {

        // Store first value in a temporary variable
        int temp = arr[first];

        // Put second value at first position
        arr[first] = arr[second];

        // Put temporary value at second position
        arr[second] = temp;
    }
}
