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
    int index=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    private TreeNode helper(int[] preorder,int min,int max){
        if(index==preorder.length){
            return null;
        }

        if(preorder[index]<min || preorder[index]>max){
            return null;
        }

        TreeNode root=new TreeNode(preorder[index]);
        index++;
        root.left=helper(preorder,min,root.val);
        root.right=helper(preorder,root.val,max);
        return root;
    }
}