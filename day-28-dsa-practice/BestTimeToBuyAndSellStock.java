public class BestTimeToBuyAndSellStock {
    // Brute Force Approach
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static int maxProfitBrute(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    // Optimized Approach
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int maxProfitOptimized(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfitBrute(prices);
        System.out.println("Maximum Profit: " + maxProfit);

        int maxProfitOptimized = maxProfitOptimized(prices);
        System.out.println("Maximum Profit (Optimized): " + maxProfitOptimized);
    }
}
