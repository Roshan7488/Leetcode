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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode temp = head.next; 
        ListNode evenHead = temp;   

        while (temp != null && temp.next != null) {
            odd.next = temp.next;    
            odd = odd.next;

            temp.next = odd.next;  
            temp = temp.next;
        }

        odd.next = evenHead;
        return head;
    }
}
