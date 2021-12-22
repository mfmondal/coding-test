package com.mondal.junit5;

public class BuyingAndSellingStock {

	public static void main(String[] args) {
		 int[] prices = {3,3,5,0,0,3,1,4};
		// int[] prices = {1,2,3,4,5};
		// int[] prices = {7,6,4,3,1};
		// int[] prices = {1,2};
		// int[] prices = {2,1};
		// int[] prices = { -1, -2 };
		 
		 int maxProfit=0;
		try {
			for (int i = 0; i < prices.length; i++) {
				if (prices[i] < 0) {
					throw new IllegalArgumentException("Prices cannot be negative");
				}

				BuyingAndSellingStock buyingAndSellingStock = new BuyingAndSellingStock();
				maxProfit = buyingAndSellingStock.maxProfit(prices);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(maxProfit);

	}

	public int maxProfit(int[] prices) {
			int n = prices.length;
			
			if (prices == null || prices.length == 0 || prices.length < 2) {
				return 0;
			}

			int[] profit = new int[n];

			int maxPrice = prices[n - 1];

			for (int i = n - 2; i >= 0; i--) {
				if (prices[i] > maxPrice) {
					maxPrice = prices[i];
				}
				
				if(profit[i + 1]> (maxPrice - prices[i])) {
					profit[i] = profit[i+1];
				}else{
					profit[i] = maxPrice - prices[i];
				}
			}

			int minPrice = prices[0];
			for (int i = 1; i < n; i++) {

				if (prices[i] < minPrice) {
					minPrice = prices[i];
				}
				
				profit[i] = profit[i - 1]> (profit[i] + (prices[i] - minPrice)) ? profit[i - 1] : profit[i] + (prices[i] - minPrice);
			}
			
			return profit[n - 1];
	}

}
