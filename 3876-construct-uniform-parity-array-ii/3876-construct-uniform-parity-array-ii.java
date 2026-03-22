class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int count = 0;
        int smallestOdd = Integer.MAX_VALUE;
        int smallestEven = Integer.MAX_VALUE;
        for (int num : nums1) {
            if (num % 2 == 0) {
                count++;
                smallestEven=Math.min(smallestEven,num);
            } else {
                smallestOdd=Math.min(smallestOdd,num);
            }
        }
        if (count == 0 || count == n) {
            return true;
        }

        if (smallestEven < smallestOdd) {
            return false;
        }

        return true;
    }
}