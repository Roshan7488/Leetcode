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
    private int sum=0;
    public int sumNumbers(TreeNode root) {
        if(root==null){
            return 0;
        }
        dfs(root,0);
        return sum;
    }
    private void dfs(TreeNode root,int currentNumber){
        if(root==null){
            return;
        }
        currentNumber=currentNumber*10+root.val;
        if(root.left==null && root.right==null){
            sum+=currentNumber;
            return;
        }
        dfs(root.left,currentNumber);
        dfs(root.right,currentNumber);
        
    }
}