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
    private List<Integer> arr = new ArrayList<>();
    private int freq = 1;
    private HashMap<Integer,Integer> map = new HashMap<>();

    public int[] findMode(TreeNode root) {
        if(root==null){
            return new int[0];
        }
        inorder(root);
        for(int key:map.keySet()){
            if(map.get(key)==freq){
                arr.add(key);
            }
        }
        int[] ans=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
    private void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        if(!map.containsKey(root.val)){
            map.put(root.val,1);
        }else{
            map.put(root.val,map.get(root.val)+1);
            freq = Math.max(freq, map.get(root.val));
        }
        inorder(root.right);

    }
}