package sorting;

import java.util.Arrays;
import java.util.logging.Logger;
/*Best Case  : O(n)
Average    : O(n²)
Worst Case : O(n²)*/
public class BubbleSortOptimized {

    static Logger logger = Logger.getLogger(BubbleSortOptimized.class.getName());
    public static void main(String[] args) {
        int[] arr = new int[]{20,5,3,2,8,5,3,10};
       sortArray(arr);
        logger.info(Arrays.toString(arr));
    }
    static void sortArray(int[] nums){
        for(int i= 0;i<nums.length;i++){
            boolean swapped = false;
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] =nums[j+1];
                    nums[j+1] = temp;
                    swapped  = true;
                }
            }
            if(!swapped){
                break;
            }
        }

    }
}
