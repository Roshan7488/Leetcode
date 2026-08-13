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
    private TreeNode prev=null;
    private TreeNode head=null;
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return head;
    }
    private void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        
        if(prev!=null){
            prev.right=root;
        }else{
            head=root;
        }
        root.left=null;
        prev=root;
       
        
        inorder(root.right);
        return;
        
    }
}