/*
 * @lc app=leetcode id=977 lang=java
 *
 * [977] Squares of a Sorted Array
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int k = 0;
        int positive = 0;
        int negative = nums.length - 1;
        while (negative >= 0 && positive < nums.length) {
            if (nums[negative] >= 0)
                negative--;
            if (nums[positive] < 0)
                positive++;
            if (negative < 0 || positive >= nums.length)
                break;
            if (nums[negative] < 0 && nums[positive] >= 0)
                break;
        }
        while (negative >= 0 || positive < nums.length) {
            if (negative < 0) {
                result[k++] = nums[positive] * nums[positive];
                positive++;
            } else if (positive >= nums.length) {
                result[k++] = nums[negative] * nums[negative];
                negative--;

            } else if (Math.abs(nums[negative]) >= Math.abs(nums[positive])) {
                result[k++] = nums[positive] * nums[positive];
                positive++;
            } else if (Math.abs(nums[negative]) < Math.abs(nums[positive])) {
                result[k++] = nums[negative] * nums[negative];
                negative--;
            }
        }
        return result;

    }
}
// @lc code=end
