class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        int prev=nums[0];
        map.put(prev,true);
        for(int i=1;i<nums.length;i++){
            int curr=nums[i];
            if(!map.containsKey(curr)){
                map.put(curr,true);
            }else{
                if(curr!=prev){
                    map.put(curr,false);
                }
            }
            prev=curr;
        }
        int count=0;
        for(Boolean spec:map.values()){
            if(spec){
                count++;
            }
        }
        return count;
    }
}