package leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class EightSixTwo {
    public static void main(String[] args) {
        int[] arr = {84,-37,32,40,95};
        System.out.println(shortestSubarray(arr,167));
//        System.out.println(shortestSubarray(arr,1));
    }

       static public int shortestSubarray(int[] nums, int k) {
            Deque<Integer> deque = new ArrayDeque<>();
            int minLen = Integer.MAX_VALUE;
            int val = 0;
            int left = 0;
            for (int i = 0; i < nums.length; i++) {

                deque.offerLast(i);
                val+= nums[deque.peekLast()];

                while(val>= k){
                    if (i - left +1  < minLen) {
                        minLen = i - left +1 ;

                    }
                    if(deque.peekFirst()!=null){
                        val-=nums[deque.pollFirst()];

                    }else{
                        break;
                    }
                    left++;

                }


                if (i - left + 1 >= minLen) {
                    val -= nums[deque.pollFirst()];
                    left++;
                }
            }
            return minLen;
        }

}
