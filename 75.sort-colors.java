/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int i = 0;
        int k = 0;
        int j = nums.length - 1;
        while (k <= j) {
            if (nums[k] == 0) {
                int tmp = nums[i];
                nums[i] = nums[k];
                nums[k] = tmp;
                k++;
                i++;
            }

            else if (nums[k] == 2) {
                int tmp = nums[j];
                nums[j] = nums[k];
                nums[k] = tmp;
                j--;
            } else
                k++;
        }

    }
}
// @lc code=end
