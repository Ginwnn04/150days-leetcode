/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int tmp = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (tmp + nums[i] > nums[i]) {
                tmp += nums[i];
            } else {
                tmp = nums[i];
            }
            if (tmp > result) {
                result = tmp;
            }
        }
        return result;
    }
}
// @lc code=end
