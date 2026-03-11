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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    private TreeNode build(int[] nums,int left,int right){
        if(left>right){
            return null;
        }
        int index=maxValue(nums,left,right);
        TreeNode root=new TreeNode(nums[index]);

        root.left=build(nums,left,index-1);
        root.right=build(nums,index+1,right);
        return root;
        
    }

    private int maxValue(int[] nums, int left, int right) {
        int max = nums[left];
        int index = left;
        for (int i = left; i <=right; i++) {
            if (max < nums[i]) {
                max = nums[i];
                index = i;
            }
        }
        return index;
    }
}