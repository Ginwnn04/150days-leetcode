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
        int negative = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                positive = i;
                break;
            }
        }
        if (positive == 0) {
            negative = nums.length;
            positive = nums.length + 1;
        }
        
        else if (positive == nums.length) {
            negative = -1;
            positive = 0;
        }
        while (negative >= 0 || positive < nums.length) {
            if (negative < 0) {
                result[k++] = nums[positive] * nums[positive];
                positive++;
            } 
            else if (positive > nums.length) {
                result[k++] = nums[negative] * nums[negative];
                negative--;
            }
            else if (Math.abs(nums[negative]) >= Math.abs(nums[positive])) {
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

