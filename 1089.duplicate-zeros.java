/*
 * @lc app=leetcode id=1089 lang=java
 *
 * [1089] Duplicate Zeros
 */

// @lc code=start
class Solution {
    public void duplicateZeros(int[] arr) {
        int[] result = new int[arr.length];
        int k = 0;
        int i = 0;
        while (k < arr.length) {
            if (arr[i] != 0) {
                result[k++] = arr[i];
            } else {
                result[k++] = 0;
                if (k >= arr.length) {
                    break;
                }
                result[k++] = 0;
            }
            i++;
        }
        for (int j = 0; j < arr.length; j++) {
            arr[j] = result[j];
        }

    }
}
// @lc code=end
