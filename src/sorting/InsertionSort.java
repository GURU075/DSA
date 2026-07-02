package sorting;

//Insertion Sort:
//Insert current element into sorted left portion.
//        Best O(n), Worst O(n²).

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{20, 5, 3, 2, 8, 5, 3, 10};
        sortArray(arr);
        for (int n : arr) {
            System.out.print(n + ", ");
        }
    }

        static void sortArray ( int[] nums){

            for (int i = 1; i < nums.length; i++) {
                int j = i;
                while (j > 0 && nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    j--;
                }
            }
        }

}
