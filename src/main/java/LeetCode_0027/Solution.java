package LeetCode_0027;

/**
 * @Author: Q-WHai
 * @Date: Created in 14:36 2019/03/19
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int count = nums.length;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (val == nums[i]) {
                remove(nums, i);
                count--;
            }
        }
        return count;
    }

    private void remove(int[] nums, int i) {
        for (int j = i + 1; j < nums.length; j++) {
            nums[j - 1] = nums[j];
        }
    }
}
