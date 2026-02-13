//Q. find the minmun element in the array
public class find_minimum_no {
    public static void main(String[] args) {
        int[] arr = {18,12,7,3,14,28};
        System.out.println(min(arr));
    }
    //assume arr.length != 0
    static int min(int[] arr){
        int minimum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<minimum){
                minimum = arr[i];
            }
        }
        return minimum;
    }
}
