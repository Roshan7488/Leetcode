class Solution {
    public int scoreDifference(int[] nums) {
        int firstPlayer=0;
        int secondPlayer=0;
        boolean firstActive=true;
        int count=0;
        for(int i=0;i<nums.length;i++){
            count++;
            if(nums[i]%2!=0){
                firstActive=!firstActive;
            }
            if(count==6){
                firstActive=!firstActive;
                count=0;
            }
            if(firstActive){
                firstPlayer+=nums[i];
            }
            else{
                secondPlayer+=nums[i];
            }
        }
        return firstPlayer-secondPlayer;
    }
}