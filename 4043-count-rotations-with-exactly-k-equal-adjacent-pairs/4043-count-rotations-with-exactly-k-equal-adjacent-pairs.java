class Solution {
    public int countRotations(String s, int k) {
        int count=0;
        int n=s.length();
        if(n==0) return (k==0) ? 1:0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==s.charAt((i+1)%n)){
                count++;
            }
        }
        if(count==k){
                return s.length()-count;
            }
            else if(k==count-1){
                return count;
            }
        return 0;
    }
}