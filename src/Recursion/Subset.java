package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subset{

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        Subset obj = new Subset();
        List<List<Integer>> result = obj.subsets(nums);

        System.out.println("Final Subsets:");
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums,
                           int index,
                           List<Integer> current,
                           List<List<Integer>> result) {

        // 🔴 Put breakpoint here
        if (index == nums.length) {
            result.add(new ArrayList<>(current)); // copy
            return;
        }

        // ✅ INCLUDE nums[index]
        current.add(nums[index]);
        backtrack(nums, index + 1, current, result);

        // 🔙 BACKTRACK (undo include)
        current.remove(current.size() - 1);

        // ❌ EXCLUDE nums[index]
        backtrack(nums, index + 1, current, result);
    }
}
