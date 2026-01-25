class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len=nums1.length;
        int len1=nums2.length;
        
        int[] ans=new int[len];
        for(int i=0;i<len;i++){
            int index=-1;
            for(int j=0;j<len1;j++){
                if(nums1[i]==nums2[j]){
                    index=j;
                    break;
                }
            }
            ans[i]=-1;
            for(int j=index+1;j<len1;j++){
                if(nums2[j]>nums1[i]){
                    ans[i]=nums2[j];
                    break;
                }
            }
        }
        return ans;
    }
}