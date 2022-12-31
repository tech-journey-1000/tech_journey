package mastery;

public class StockMaxProfit {

    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};
        System.out.print(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int profit = 0;
        int buy = Integer.MAX_VALUE; //1111111

        for(int i=0;i<prices.length;i++) {

            if(buy<prices[i]) {
                int profitCol = prices[i]-buy; //
                profit = profit+profitCol; // 1 + 1 + 1 + 1
                buy = Integer.MAX_VALUE; //111111
            }

            if (i<prices.length-1 && prices[i]<prices[i+1]) { // 1<2, 2<3
                buy = prices[i]; //1
            }

        }

        return profit;
    }
}
