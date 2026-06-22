package leetcode;

import java.util.Arrays;

public class MiissingNumber {


    private static int FindMiissingNumber(int[] arr){
        Arrays.sort(arr);
        for(int i=1;i<=arr.length;i++){
            if(i!=arr[i-1]){
                return i;
            }
        }
        return 0;

    }

    private static int FindMiissingNumber1(int[] arr){
        int sum=0;
        int expectedSum =  0;
        int n= arr.length+1;
        for(int i=1;i<n;i++){
            sum+= arr[i-1];
        }

        expectedSum = n*(n+1)/2;
        return expectedSum-sum;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,3,2,1};
//        System.out.println(FindMiissingNumber(arr));
        System.out.println(FindMiissingNumber1(arr));

    }
}
