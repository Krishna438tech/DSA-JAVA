// Q. arr = [18,12,-7,3,14,28]
//search for 3 in the range of index[1,4]

public class search_in_range {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int target = 14;
        // int target = 3;
        // int target = 18;
        // int target = 28;
        System.out.println(linearsearch(arr, target, 1, 4));
    }
    static int linearsearch(int[] arr, int target,  int start, int end){
        if(arr.length ==0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int element = arr[i];   
            if(element == target){
                return i;   
            }
        }
        return -1;
    }
}
