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
 import java.util.*;
class Solution {
    int level=-1;
    long sum=0;
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root==null ){
            return -1;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Long> levelSums=new ArrayList<>();
        long sum=0;
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            if(curr==null){
                levelSums.add(sum);
                sum=0;
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                sum+=curr.val;
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        Collections.sort(levelSums,Collections.reverseOrder());
        if(k>levelSums.size()){
            return -1;
        }
        return levelSums.get(k-1);
        
    }
}