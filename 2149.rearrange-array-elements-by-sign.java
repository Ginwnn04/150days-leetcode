/*
 * @lc app=leetcode id=2149 lang=java
 *
 * [2149] Rearrange Array Elements by Sign
 */

// @lc code=start
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] positive = new int[nums.length / 2];
        int[] negative = new int[nums.length / 2];
        int i = 0;
        int j = 0;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] > 0) {
                positive[i++] = nums[k];
            } else {
                negative[j++] = nums[k];
            }
        }

        for (int k = nums.length - 1; k >= 0; k--) {
            if (j >= i) {
                nums[k] = negative[--j];

            } else {
                nums[k] = positive[--i];

            }
        }
        return nums;
    }
}
// @lc code=end
