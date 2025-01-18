/*
 * @lc app=leetcode id=1422 lang=java
 *
 * [1422] Maximum Score After Splitting a String
 */

// @lc code=start
class Solution {
    public int maxScore(String s) {
        int leftScore = s.charAt(0) == '0' ? 1 : 0;
        int rightScore = 0;
        int maxScore = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                rightScore++;
        }
        if ((leftScore == 0 && rightScore == s.length() - 1) || (leftScore == 1 && rightScore == 0)) {
            return s.length() - 1;
        }
        for (int i = 1; i < s.length(); i++) {
            if (leftScore + rightScore > maxScore)
                maxScore = leftScore + rightScore;
            if (s.charAt(i) == '0') {
                leftScore++;
            }
            else
                rightScore--;
            
        }
        return maxScore;

    }
}
// @lc code=end
