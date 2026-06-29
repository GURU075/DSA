package sorting;

public class MergeSort{
    public static void main(String[] args) {
        int[] arr = new int[]{2,10,4,22,3,9,5,8,7};
        sortArray(arr);
        for (int n:arr){
            System.out.print(n+" ");
        }
    }
  static void sortArray(int[] nums){
        divide(0,nums.length-1,nums);
  }
  static void divide(int s,int e,int[] nums){
        if(s>=e){
            return;
        }
        int mid = s+(e-s)/2;
        divide(s,mid,nums);
        divide(mid+1,e,nums);
        conquer(s,mid,e,nums);
  }
  static void conquer(int s,int mid,int e, int[] nums){
        int idx1= s;
        int idx2= mid+1;
        int[] ans = new int[e-s+1];
        int idx=0;
        while(idx1<=mid && idx2<=e){
            if(nums[idx1]<=nums[idx2]){
                ans[idx++] = nums[idx1++];
            }else{
                ans[idx++] = nums[idx2++];
            }
        }
        while(idx1<=mid){
            ans[idx++] = nums[idx1++];
        }
      while(idx2<=e){
          ans[idx++] = nums[idx2++];
      }
      for(int i=s,j=0;i<=e;i++,j++){
          nums[i] = ans[j];
      }
  }

}
