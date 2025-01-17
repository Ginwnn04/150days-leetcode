/*
 * @lc app=leetcode id=414 lang=java
 *
 * [414] Third Maximum Number
 */

// @lc code=start
class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        if (nums.length == 1)
            return nums[0];
        if (nums.length == 2)
            return Math.max(nums[0], nums[1]);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == first || nums[i] == second || nums[i] == third)
                continue;
            if (nums[i] > first) {
                third = second;
                second = first;
                first = (long) nums[i];
            }
            else if (nums[i] > second) {
                third = second;
                second = (long) nums[i];
            } else if (nums[i] > third)
                third = (long) nums[i];
        }
        if (third == Long.MIN_VALUE)
            return (int) first;
        else
            return (int) third;
    }
}
// @lc code=end
