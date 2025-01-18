/*
 * @lc app=leetcode id=941 lang=java
 *
 * [941] Valid Mountain Array
 */

// @lc code=start
class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        boolean desc = false;
        for (int i = 0; i < arr.length - 1; i++) {
            // Tang dan
            if (!desc) {
                if (arr[i] > arr[i + 1]) {
                    if (i == 0 || ((arr[i - 1] > arr[i]) && (arr[i] > arr[i + 1]))) {
                        return false;
                    }
                    desc = true;
                } else if (arr[i] == arr[i + 1]) {
                    return false;
                }
            }
            // Giam dan
            else {
                if (arr[i] <= arr[i + 1]) {
                    return false;
                }

            }
        }
        if (!desc) {
            return false;
        }
        return true;
    }
}
// @lc code=end
