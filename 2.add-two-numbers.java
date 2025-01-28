/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int borrow = 0;
        ListNode head = new ListNode();
        ListNode tmp = head;

        while (l1 != null || l2 != null) {
            int num = 0;
            if (l1 != null && l2 != null) {
                num = l1.val + l2.val + borrow;
                l1 = l1.next;
                l2 = l2.next;

            } else if (l1 != null) {
                num = l1.val + borrow;
                l1 = l1.next;
            } else if (l2 != null) {
                num = l2.val + borrow;
                l2 = l2.next;
            }
            ListNode newNode = new ListNode(num % 10);
            borrow = num / 10;
            tmp.next = newNode;
            tmp = newNode;
        }
        if (borrow == 1) {
            ListNode newNode = new ListNode(borrow);
            tmp.next = newNode;
            tmp = newNode;
        }

        return head.next;

    }
}
// @lc code=end
