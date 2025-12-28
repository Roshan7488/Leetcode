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
        HashSet<ListNode> set=new HashSet<>();
        ListNode temp=headA;
        if(headA ==null ||headB==null) return null;
        while(temp!=null){
            set.add(temp);
            temp=temp.next;
        }
        ListNode tempB=headB;
        while(tempB!=null){
            if(set.contains(tempB)){
                return tempB;
            }
            tempB=tempB.next;
        }
        return null;

    }
}