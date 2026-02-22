class Solution {
    public boolean isDigitorialPermutation(int n) {
        int[] digitorials = {1, 2, 145, 40585};
        
        char[] inputDigits = String.valueOf(n).toCharArray();
        Arrays.sort(inputDigits);
        
        for (int num : digitorials) {
            char[] digits = String.valueOf(num).toCharArray();
            
            if (digits.length != inputDigits.length) continue;
            
            Arrays.sort(digits);
            
            if (Arrays.equals(digits, inputDigits)) {
                return true;
            }
        }
        
        return false;
    }
}