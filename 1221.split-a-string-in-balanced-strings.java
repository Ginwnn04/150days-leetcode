/*
 * @lc app=leetcode id=1221 lang=java
 *
 * [1221] Split a String in Balanced Strings
 */

// @lc code=start
class Solution {
    public int balancedStringSplit(String s) {
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R')
                count++;
            else
                count--;
            if (count == 0)
                maxCount++;
        }

        return maxCount;
    }
}
// @lc code=end
