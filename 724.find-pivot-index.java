/*
 * @lc app=leetcode id=724 lang=java
 *
 * [724] Find Pivot Index
 */

// @lc code=start
class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == total - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;

    }
}
// @lc code=end

