class Solution {
    public int findDuplicate(int[] nums) {
        // HashSet<Integer> set=new HashSet<>();
        // int i;
        // for(i=0;i<nums.length;i++){
        //     if(!set.contains(nums[i])){
        //         set.add(nums[i]);
        //     }
        //     else{
        //         break;
        //     }
        // }
        // return nums[i];
        int i;
        boolean bool[]=new boolean[nums.length+1];
        for(i=0;i<nums.length;i++){
            if(bool[nums[i]]){
                break;
            }
            else{
                bool[nums[i]]=true;
            }
        }
        return  nums[i];

    }
}