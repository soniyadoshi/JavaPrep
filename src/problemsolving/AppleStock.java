package problemsolving;

/* Suppose we could access yesterday's stock prices as an array, where:

The indices are the time in minutes past trade opening time, which was 9:30am local time.
The values are the price in dollars of Apple stock at that time.
So if the stock cost $500 at 10:30am, stockPricesYesterday[60] = 500.

Write an efficient method that takes stockPricesYesterday and returns the best profit 
I could have made from 1 purchase and 1 sale of 1 Apple stock yesterday. */

public class AppleStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] stockPricesYesterday = new int[] {7,1,5,3,6,4};

		getMaxProfit(stockPricesYesterday);
		// returns 6 (buying for $5 and selling for $11)

	}
	
	public static void getMaxProfit(int stckPrices[])
	{
		int minBuy = stckPrices[0];
		int maxProfit =0;
		
		for(int i=0; i<stckPrices.length; i++)
		{

			minBuy = Math.min(minBuy, stckPrices[i]);

			if (stckPrices[i] - minBuy > maxProfit) {
				maxProfit = stckPrices[i] - minBuy;
			}

		}
		System.out.println( "profit :: "+ maxProfit);	
		
	}

}
