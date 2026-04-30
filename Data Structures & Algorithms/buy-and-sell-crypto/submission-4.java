class Solution {
    public int maxProfit(int[] prices) {

        int i = 0;
        int j = 1;

        int max = 0;

        while(j < prices.length){
            int curr = prices[j] - prices[i];
            if(curr < 0){
                i = j;
                j = i + 1;
            }
            else{
                j++;
            }
            max = Math.max(max, curr);
        }
        return max;
    }
}
