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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int cnt = 0;
        ListNode p1 = head;
        ListNode p2= head;
        if(head.next == null){
            head = null;
            return head;
        }
        else{
            while(cnt < n){
                if(cnt+1 == n && p1.next == null){
                    head = head.next;
                    return head;
                }
                    
                p1 = p1.next;
                cnt++;
            }
            while(p1.next != null){
                p1 = p1.next;
                p2 = p2.next;
            }
            p2.next = p2.next.next;
        }
        //System.out.println(cnt);
        return head;
    }
}