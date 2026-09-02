class Solution {
    public int maxProfit(int[] prices) {
        int Profit=0;
        int bestBuy=prices[0];

        for(int i=0;i<prices.length;i++){
            int currentprices=prices[i];

            if(currentprices > bestBuy){
                Profit=Math.max(Profit,currentprices-bestBuy);

            }
            bestBuy =Math.min(bestBuy,currentprices);
        }
        return Profit;
    }
}