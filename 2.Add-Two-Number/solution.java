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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1=l1;
        ListNode head2=l2;
        ListNode dummyhead=new ListNode();
        ListNode head3=dummyhead;
        int quo=0,rem;
        while(head1 !=null || head2 !=null||quo!=0){
            int val1=0;
            int val2=0;
            if(head1!=null){
                val1=head1.val;
                head1=head1.next;
            }
            if(head2!=null){
                val2=head2.val;
                head2=head2.next;
            }
            int sum=val1+val2+quo;
            if(sum>9){
                rem=sum%10;
                quo=sum/10;
            }
            else{
                rem=sum;
                quo=0;
            }
            ListNode newNode=new ListNode();
            newNode.val=rem;
            head3.next=newNode;
            head3=newNode;
        }
        return dummyhead.next;
    }
}