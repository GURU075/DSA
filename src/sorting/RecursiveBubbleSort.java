package sorting;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,6,4,8,1};
        sortArray(nums,nums.length);
        for (int n : nums) {
            System.out.print(n + ", ");
        }
    }
    static void sortArray(int[] nums,int n){
        if(n==1){
            return;
        }
        boolean isSwapped = false;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
                isSwapped = true;
            }
        }
        if(!isSwapped) return;
        
         sortArray(nums,n-1);
    }
}
