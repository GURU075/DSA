package leetcode;

public class RemoveDuplicate {

    public static void main(String[] args) {

        int[] arr = new int[]{1,1,1,2,2,3};
        int[] arr1 = new int[]{0,0,1,1,1,1,2,3,3};
        int[] arr2 = new int[]{1,3,3,3,2,2};

//      int ans =   removeDuplicates(arr1);
      int ans =  removeDuplicates1(arr2);
        System.out.println(ans);


    }

    public static int removeDuplicates(int[] nums) {
        int start = 0;
        int fast = 1;
        int count = 1;
        int len = nums.length;
        int idx= 0;
        while(fast<=len ){
            while(fast!=len && nums[fast]==nums[start]){
                count++;
                fast++;
            }
            if(count>=2) {
                count=2;
            }else{
                count = 1;
            }


            for(int i=0;i<count;i++){
                nums[idx++]=nums[start];
            }
            count = 1;
            start =fast++;

        }

        return idx;
    }


    static  public  int removeDuplicates1(int[] nums) {

            if(nums.length <= 2) {
                return nums.length;
            }

            int idx = 2;

            for(int i = 2; i < nums.length; i++) {

                if(nums[i] != nums[idx - 2]) {
                    nums[idx] = nums[i];
                    idx++;
                }
            }

            return idx;
        }

}
