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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    ListNode head;
    public TreeNode sortedListToBST(ListNode head) {
        this.head=head;
        if(head==null){
            return null;
        }
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return build(0,count-1);

    }
    public TreeNode build(int left,int right){
        if(left>right){
            return null;
        }
        int mid=left+(right-left)/2;
        
        TreeNode leftTree=build(left,mid-1);
        TreeNode root=new TreeNode(head.val);
        root.left=leftTree;
        head=head.next;
        TreeNode rightTree=build(mid+1,right);
        root.right=rightTree;
        return root;
    }
}