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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> subList=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        while(!queue.isEmpty()){
            TreeNode current=queue.poll();
            if(current==null){
                if(queue.peek()!=null) queue.offer(null);
                ans.add(subList);
                subList = new ArrayList<>();
            }else{
                subList.add(current.val);
            if(current.left!=null){
                queue.offer(current.left);
            }
            if(current.right!=null){
                queue.offer(current.right);
            }
            }
        }
        return ans;
    }
}