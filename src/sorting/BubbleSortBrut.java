package sorting;


import java.util.Arrays;
import java.util.logging.Logger;
/*Best Case  : O(n²)
Average    : O(n²)
Worst Case : O(n²)*/


//Bubble Sort:
//Adjacent swap.
//Largest goes to end.
public class BubbleSortBrut {

   static Logger logger = Logger.getLogger(BubbleSortBrut.class.getName());
    public static void main(String[] args) {
        int[] arr = new int[]{20,5,3,2,8,5,3,10};
        arr = sortArray(arr);
//        for(int n:arr){
//            logger.info(n+", ");
//        }
        logger.info(Arrays.toString(arr));
    }
    static int[] sortArray(int[] nums){
        for(int i= 0;i<nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] =nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
}
