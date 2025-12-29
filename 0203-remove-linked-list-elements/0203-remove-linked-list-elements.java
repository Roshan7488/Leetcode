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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        ListNode temp=head;
        ListNode forward=temp.next;
        ListNode curr;
        while(head.val==val){
            head=head.next;
            if(head==null) return head;
        }
        while(forward!=null){
            if(forward.val==val){
                curr=forward.next;
                temp.next=curr;
                forward=curr;
            }
            else{
            temp=temp.next;
            forward=forward.next;
            }
        }
        return head;
    }
}