/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp=headA;
        ListNode tempB=headB;
        while(tempB!=null && temp!=null){
            if(temp==tempB){
                return tempB;
            }
            tempB=tempB.next;
        }
        if(temp==null){
            return null;
        }
        return getIntersectionNode(temp.next,headB);
    }
}