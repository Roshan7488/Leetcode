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
    public void reorderList(ListNode head) {
        if(head==null) return;
        Stack<ListNode> stack=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            stack.push(temp);
            temp=temp.next;
        }
        ListNode curr=head;
        int size=stack.size();
        for(int i=0;i<size/2;i++){
            ListNode last=stack.pop();
            ListNode prev=curr.next;
            curr.next=last;
            last.next=prev;
            curr=prev;
        }
        curr.next=null;
    }
}