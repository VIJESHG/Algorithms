/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow_ptr = head;
        ListNode fast_ptr = head;
        
        if(head == null)
            return false;
        else if(head.next == null)
            return false;
        while(fast_ptr != null && fast_ptr.next != null){
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
            
            if(slow_ptr == fast_ptr)
                return true;
        }
        return false;
        
    }
}