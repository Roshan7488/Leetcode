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
        ListNode currA=headA;
        ListNode currB=headB;
        while(currA!=currB){
            currA=currA==null ? headA:currA.next;
            currB=currB==null ? headB:currB.next;
        }
        return currA;
    }
}