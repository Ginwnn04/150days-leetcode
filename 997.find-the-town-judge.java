/*
 * @lc app=leetcode id=997 lang=java
 *
 * [997] Find the Town Judge
 */

// @lc code=start
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] mask = new int[n];
        // System.out.println(trust.length);
        for (int i = 0; i < trust.length; i++) {
            mask[trust[i][1] - 1]++;
        }
        int candidate = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (candidate < mask[i]) {
                candidate = mask[i];
            }
        }

        return candidate;
    }
}
// @lc code=end
