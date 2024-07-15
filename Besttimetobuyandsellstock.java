class Solution {
    public int maxProfit(int[] prices) {
        int pist = 0;
        int ltn = Integer.MAX_VALUE;
        int op = 0;
        for(int i =0;i<prices.length;i++){
            if(prices[i]<ltn){
                ltn = prices[i];
            }
            pist = prices[i] - ltn;
            if(op<pist){
                op = pist;
            }
        }
        return op;
    }
}
