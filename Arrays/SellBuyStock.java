// #Problem: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

// Example 1:

// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
// Example 2:

// Input: prices = [7,6,4,3,1]
// Output: 0
// Explanation: In this case, no transactions are done and the max profit = 0.


public class SellBuyStock {
    public static int[] main(String[] args){
        // Input example 1
        int[] prices = {7,1,5,3,6,4};

        // Taking a variable to store buying price of stocks
        int minPrice = prices[0];
        // Integer to store max-profit after selling the stocks
        int maxProfit = 0;

        // Integer to analyze the current profit in stocks
        int currProfit = 0;
        // Iterating the loop from Starting price to end price
        for(int i=0; i < prices.length; i++){
            // buying the stocks if it's cheaper than the previous price and keeping it until we don't found any less price
            if(minPrice > prices[i]){
                minPrice = prices[i];
            }

            // Checking the current profit after selling the stocks to today's prices
            if(prices[i] > minPrice){
                currProfit = prices[i] - minPrice;
            }

            // also storing the current profit if it could be the max profit
            if(currProfit > maxProfit){
                maxProfit = currProfit;
            }
        }
        // Printing the max profit
        System.out.println(maxProfit);

        return null;
    }
}


// Constraints:

// 1 <= prices.length <= 10 to power 5
// 0 <= prices[i] <= 10 to power 4