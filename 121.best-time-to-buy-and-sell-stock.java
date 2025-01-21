/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int i = 0;
        for (int j = 1; j < prices.length; j++) {
            if (prices[i] > prices[j]) {
                i = j;
            } else {
                if (prices[j] - prices[i] > max) {
                    max = prices[j] - prices[i];
                }
            }
        }
        return max;
    }
}
// @lc code=end

