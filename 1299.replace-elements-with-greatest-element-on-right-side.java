/*
 * @lc app=leetcode id=1299 lang=java
 *
 * [1299] Replace Elements with Greatest Element on Right Side
 */

// @lc code=start
class Solution {
    public int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        result[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i + 1] > result[i + 1]) {
                result[i] = arr[i + 1];
            }
            else {
                result[i] = result[i + 1];
            }
        }
        return result;
    }
}
// @lc code=end
