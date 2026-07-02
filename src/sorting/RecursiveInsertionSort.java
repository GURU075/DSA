package sorting;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,6,4,8,1};
        sortArray(nums);
        for (int n : nums) {
            System.out.print(n + ", ");
        }
    }
    static void sortArray(int[] nums){
        if(nums.length<2) return;
        sort(nums,1);
    }
    static void sort(int[] nums,int i){
        if(i>=nums.length) return;
        int j=i;
        while(j>0 && nums[j]<nums[j-1]){
            //swap
            int temp = nums[j];
            nums[j] =nums[j-1];
            nums[j-1] = temp;

            j--;
        }
        sort(nums,i+1);
    }
//    static void sort(int[] nums,int i){
//        if(i>=nums.length) return;
//        int j=i;
//        while(j>0){
//            if(nums[j]<nums[j-1]){
//                int temp = nums[j];
//                nums[j] =nums[j-1];
//                nums[j-1] = temp;
//            }else{
//                break;         this needs more optimized
//            }
//            j--;
//        }
//        sort(nums,i+1);
//    }
}
