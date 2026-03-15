class Solution {
    public long countCommas(long n) {
        long commas=0;
        long base=1000;
        while(base<=n){
            commas+=(n-base+1);
            base*=1000;
        }
        return commas;
    }
}