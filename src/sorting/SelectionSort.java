package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,62,3,556,2,3,6};
        arr = sortArray(arr);
        for(int n:arr){
            System.out.print(n+", ");
        }
    }
       static public int[] sortArray(int[] nums) {
            //selection sort
            for (int i = 0; i < nums.length; i++) {
                int min = i;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[min] > nums[j]) {
                        min = j;
                    }
                }
                if (nums[i] > nums[min]) {
                    int temp = nums[i];
                    nums[i] = nums[min];
                    nums[min] = temp;
                }
            }
            return nums;
        }
}
