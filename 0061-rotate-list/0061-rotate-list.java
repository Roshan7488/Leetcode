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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode temp1 = head;
        int length=1;
        while(temp1.next!=null){
            temp1=temp1.next;
            length++;
        }
        k=k%length;
        while (k-- > 0) {
            ListNode temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            ListNode store = temp.next;
            temp.next = null;
            store.next = head;
            head = store;
        }
        return head;
    }
}