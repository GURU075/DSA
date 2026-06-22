package leetcode;

import java.util.Arrays;

public class RangeAddition {

    /**
     * LeetCode 370: Range Addition
     *
     * You start with an array of zeros with a given length.
     * You're given a series of updates where each update is a triplet [startIdx, endIdx, inc].
     * Add inc to every element from index startIdx to endIdx (inclusive).
     *
     * Time Complexity: O(n + k), where n is length and k is number of updates.
     * Space Complexity: O(1) assuming the output array is not counting towards extra space, else O(n).
     */
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] result = new int[length];

        // Apply difference array strategy
        for (int[] update : updates) {
            int startIdx = update[0];
            int endIdx = update[1];
            int inc = update[2];

            result[startIdx] += inc;
            
            if (endIdx + 1 < length) {
                result[endIdx + 1] -= inc;
            }
        }

        // Calculate prefix sum to get actual values
        for (int i = 1; i < length; i++) {
            result[i] += result[i - 1];
        }

        return result;
    }

    public static void main(String[] args) {
        RangeAddition solution = new RangeAddition();

        // Test Case 1: Example from problem
        int length1 = 5;
        int[][] updates1 = {
            {1, 3, 2},
            {2, 4, 3}
        };
        int[] result1 = solution.getModifiedArray(length1, updates1);
        System.out.println("Test Case 1:");
        System.out.println("Input: length = " + length1 + ", updates = " + Arrays.deepToString(updates1));
        System.out.println("Expected: [0, 2, 5, 5, 3]");
        System.out.println("Actual:   " + Arrays.toString(result1));
        System.out.println();

        // Test Case 2: Single update covering entire range
        int length2 = 3;
        int[][] updates2 = {
            {0, 2, 5}
        };
        int[] result2 = solution.getModifiedArray(length2, updates2);
        System.out.println("Test Case 2:");
        System.out.println("Input: length = " + length2 + ", updates = " + Arrays.deepToString(updates2));
        System.out.println("Expected: [5, 5, 5]");
        System.out.println("Actual:   " + Arrays.toString(result2));
        System.out.println();

        // Test Case 3: No updates
        int length3 = 4;
        int[][] updates3 = {};
        int[] result3 = solution.getModifiedArray(length3, updates3);
        System.out.println("Test Case 3:");
        System.out.println("Input: length = " + length3 + ", updates = " + Arrays.deepToString(updates3));
        System.out.println("Expected: [0, 0, 0, 0]");
        System.out.println("Actual:   " + Arrays.toString(result3));
        System.out.println();
        
        // Test Case 4: Overlapping updates with negative values
         int length4 = 6;
        int[][] updates4 = {
            {1, 4, -2},
            {0, 3, 5}
        };
        // Init: [0, 0, 0, 0, 0, 0]
        // Upd1: [0, -2, -2, -2, -2, 0] (indices 1-4)
        // Upd2: [5, 5, 5, 5, 0, 0] (indices 0-3)
        // Comb: [5, 3, 3, 3, -2, 0]
        int[] result4 = solution.getModifiedArray(length4, updates4);
        System.out.println("Test Case 4:");
        System.out.println("Input: length = " + length4 + ", updates = " + Arrays.deepToString(updates4));
        System.out.println("Expected: [5, 3, 3, 3, -2, 0]");
        System.out.println("Actual:   " + Arrays.toString(result4));
    }
}
