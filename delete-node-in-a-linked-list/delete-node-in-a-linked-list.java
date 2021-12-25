/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode tmp1 = node.next;
        ListNode tmp2 = tmp1.next;
        node.val = tmp1.val;
        node.next = tmp2;
        tmp1 = null;
    }
}