/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
            if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE ) {
                result = 0;
                break;
            }
        }
        return (int)result;
    }
}
// @lc code=end
