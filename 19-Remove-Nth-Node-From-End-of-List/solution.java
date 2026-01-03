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
        if(head.next==null || head==null){
            return null;
        }
        int size=0;
        ListNode curr=head;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        int prevIndex=size-n;
        ListNode prev=head;
        if(prevIndex==0){
            return head.next;
        }
        int i=1;
        while(i<prevIndex){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }
}