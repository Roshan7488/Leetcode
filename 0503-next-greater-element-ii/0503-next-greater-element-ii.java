class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=(2*n)-1;i>=0;i--){
            int curr=nums[i%n];
            while(!stack.isEmpty() && stack.peek()<=curr){
                stack.pop();
            }
            if(i<n){
                ans[i]=stack.isEmpty() ? -1 :stack.peek();
            }
            stack.push(curr);
        }
        return ans;
    }
}