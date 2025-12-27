class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int x1=x;
        while(x1>=1){
            int digit=x1%10;
            rev=(rev*10)+digit;
            x1=x1/10;
        }
        if(rev==x){
            return true;
        }
        return false;
    }
}