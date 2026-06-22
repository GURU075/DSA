package divideAndConquer;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {2,5,4,7,3,8,7,1};

        divide(arr,0,arr.length-1);
        for(int i=0; i<arr.length;i++) {
            System.out.print(arr[i]);
        }
    }

    private static void divide(int[] arr, int s, int e) {
        if(s>=e){
            return;
        }
        int mid=s+(e-s)/2;
        divide(arr,s,mid);
        divide(arr,mid+1,e);
        conquer(arr,s,mid,e);
    }

    private static void conquer(int[] arr, int s, int mid, int e) {
        int[] ans= new int[e-s+1];
        int idx1 =s;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=e){
            if(arr[idx1]<=arr[idx2]){
                ans[x++]=arr[idx1++];
            }else{
                ans[x++]=arr[idx2++];
            }
        }
        while(idx1<=mid){
            ans[x++]=arr[idx1++];
        }
        while(idx2<=e){
            ans[x++]=arr[idx2++];
        }
        for(int i=0,j=s;i<ans.length;i++,j++){
            arr[j]=ans[i];
        }
    }


}
