/*
 * @lc app=leetcode id=997 lang=java
 *
 * [997] Find the Town Judge
 */

// @lc code=start
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] mask = new int[n];
        boolean[] voted = new boolean[n];

        // System.out.println(trust.length);
        for (int i = 0; i < trust.length; i++) {
            mask[trust[i][1] - 1]++;
            voted[trust[i][0] - 1] = true;

        }
        int candidate = -1;
        for (int i = 0; i < n; i++) {
            if (mask[i] == n - 1) {
                candidate = i + 1;
                break;
            }
        }

        if (candidate == -1) {
            return candidate;
        } else {
            return voted[candidate - 1] == false ? candidate : -1;
        }
    }
}
// @lc code=end
