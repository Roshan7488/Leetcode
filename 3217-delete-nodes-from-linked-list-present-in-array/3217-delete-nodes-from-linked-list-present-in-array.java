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
    public ListNode modifiedList(int[] nums, ListNode head) {
        if (nums.length == 0 || head == null) {
            return head;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        while (prev.next != null) {
            if (set.contains(prev.next.val)) {
                ListNode curr = prev.next.next;
                prev.next = curr;
            } else {
                prev = prev.next;
            }
        }
        return dummy.next;
    }
}