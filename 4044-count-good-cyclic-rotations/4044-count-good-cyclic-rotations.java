class Solution {
    public int countGoodRotations(int[] nums) {
        int n=nums.length;
        int half=n/2;

        long totalSum=0;
        for(int i=0;i<nums.length;i++){
                totalSum+=nums[i];
        }

        long firstHalf=0;
        for(int i=0;i<half;i++){
            firstHalf+=nums[i];
        }
        int count=0;
        for(int i=0;i<n;i++){
            long secondHalf=totalSum-firstHalf;
            if(firstHalf>secondHalf){
                count++;
            }
            firstHalf=firstHalf-nums[i]+nums[(i+half)%n];
        }
        return count;
    }
}