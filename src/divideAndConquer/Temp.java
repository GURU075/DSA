package divideAndConquer;

import java.util.Arrays;

public class Temp {
    public static void main(String[] args) {
       int[] arr  = {2,6,1,3,4,52,2,9};
       divide(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void divide(int[] arr , int start, int end){

        if(start>=end){
            return ;
        }
        int mid = start + (end-start) /2 ;
        divide(arr,start, mid);
        divide(arr,mid+1,end);
        conquer(arr,start,mid,end);
    }

    static void conquer(int[] arr,int s, int m, int e ){
        int idx1 = s;
        int idx2 = m+1;
         int x= 0;
        int [] ans  = new int[e-s+1];
      while(idx1<=m&&idx2<=e){
        if(arr[idx1]<arr[idx2]){
            ans[x++] = arr[idx1++];
        }else{
            ans[x++] = arr[idx2++];
        }
      }
        while(idx1<=m){
                ans[x++] = arr[idx1++];

        }
        while(idx2<=e){
                ans[x++] = arr[idx2++];
        }

        for(int i=0,j=s;i< ans.length;i++,j++){
            arr[j] = ans[i];
        }

    }
}

