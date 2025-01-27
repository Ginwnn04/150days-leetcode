/*
 * @lc app=leetcode id=61 lang=java
 *
 * [61] Rotate List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            length++;
            tail = tail.next;
        }
        k = k % length;
        if (k == 0 || k == length) {
            return head;
        }
        else if (k == length - 1) {
            tail.next = head;
            ListNode tmp = head;
            head = head.next;
            tmp.next = null;
        }
        else {
            int i = 0;
            ListNode tmp = head;
            while (tmp != null) {
                if (i == length - k - 1) {
                    break;
                }
                i++;
                tmp = tmp.next;
            }
            tail.next = head;
            head = tmp.next;
            tmp.next = null;
        }
        
        return head;
    }
}
// @lc code=end

