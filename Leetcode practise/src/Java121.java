public class Java121 {
    public static void main(String args[]) {
        int[] prices = new int[] {7,1,5,3,6,4};
        int output = maxProfit(prices);
        System.out.println(output);
    }
//TWO LOOP Method
    public static int maxProfit(int[] prices) {
        int l = prices.length;
        int profit = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i; j < l; j++) {
                if ((prices[j] - prices[i]) > profit) {
                    profit = prices[j] - prices[i];
                }
            }
        }
        return profit;
    }
}
