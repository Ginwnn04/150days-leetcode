/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int val = nums[0];
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                cnt++;
            } else {
                cnt--;
                if (cnt == 0) {
                    val = nums[i];
                    cnt = 1;
                }
                
            }
        }
        return cnt != 0 ? val : -1;
    }
}
// @lc code=end
