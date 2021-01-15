package problemsolving;
/*
Say you have an array prices for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit.
You may complete as many transactions as you like
(i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions at the same time
(i.e., you must sell the stock before you buy again).
 */
public class MaxProfit {
    public static void main (String args[]) {
        //7,1,5,3,6,4
        //1,2,3,4,5
        //7,6,4,3,1
        //[6,1,3,2,4,7]
        int arr[] = {6,1,3,2,4,7};
        int profit = getMaxProfit(arr);
        System.out.println(profit);
    }

    public static int getMaxProfit (int prices[]) {

        int profit = 0;

        for (int i=1; i<prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
//        int min = prices[0];
//        int max = 0;
//
//        for (int i=0; i<prices.length - 1; i++) {
//
//            if (prices[i] < prices [i+1]) {
//                profit += prices[i+1] - prices[i];
//                i = i + 1;
//                min = Math.min(prices[i], min);
//                max = Math.max(prices[i+1], max);
//            }
//        }
//
//        System.out.println("profit " + profit);
//        System.out.println("min " + min);
//        System.out.println("max " + max);

//        return max - min > profit ? max - min : profit;

    }
}
