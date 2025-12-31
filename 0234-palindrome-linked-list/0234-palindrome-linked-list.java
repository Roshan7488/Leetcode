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
    public ListNode findmiddle(ListNode head){
        ListNode curr=head;
        int size=0;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        int mid=size/2;
        int j=1;
        ListNode midNode=head;
        while(j<mid){
            midNode=midNode.next;
            j++;
        }
        return midNode;
    }
    public ListNode reverse(ListNode middle){
        ListNode prev=null;
        ListNode curr=middle;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode middle=findmiddle(head);
        ListNode secondHalfStart=reverse(middle.next);
        ListNode firstHalfStart=head;
        while(secondHalfStart!=null){
            if(firstHalfStart.val != secondHalfStart.val){
                return false;
            }
            firstHalfStart=firstHalfStart.next;
            secondHalfStart=secondHalfStart.next;
        }
        return true;
    }
}