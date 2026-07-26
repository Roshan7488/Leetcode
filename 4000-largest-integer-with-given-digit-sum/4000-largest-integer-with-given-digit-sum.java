class Solution {
    public int largestInteger(int n, int s) {
        int count = 0;
        int num = s;

        if (s > 9 * n)
            return -1;
        num = s;
        int number = 0;
        while (n != 0) {
            if (num > 9) {
                number = (number * 10) + 9;
                num = num - 9;
            } else {
                number = (number * 10) + num;
                num = 0;
            }
            n--;
        }
        return number;
        
    }
}