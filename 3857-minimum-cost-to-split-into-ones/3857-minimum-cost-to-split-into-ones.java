class Solution {
    public int minCost(int n) {
        int result=0;
        while(n!=1){
            n=n-1;
            result+=n;
        }
        return result;
        
    }
}