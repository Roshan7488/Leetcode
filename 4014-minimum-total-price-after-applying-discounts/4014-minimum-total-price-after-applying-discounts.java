class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int pricesLength = prices.length;
        int disLength = discounts.length;
        double result = 0;

        for (int i = 1; i <=pricesLength; i++) {
            if(i<=disLength){
                result += prices[pricesLength-i] * (100 - discounts[disLength-i]) / 100.0;
            }else{
                result+=prices[pricesLength-i];
            }
        }
       return result;     
    }
    

}