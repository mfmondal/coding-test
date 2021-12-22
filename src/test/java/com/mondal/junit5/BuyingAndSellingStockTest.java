package com.mondal.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BuyingAndSellingStockTest {
	
	private BuyingAndSellingStock buyingAndSellingStock;

	@BeforeEach
	public void setup() {
		System.out.println("Setup");
		buyingAndSellingStock = new BuyingAndSellingStock();
	}

	
	@Test
    void stockBuySell1() {
		System.out.println("stockBuySell1");
		int[] testPrices = {100, 180, 260, 310, 40, 535, 695};
		int actualprofit = buyingAndSellingStock.maxProfit(testPrices);
		int expectedProfit= 865;
		assertEquals(expectedProfit,actualprofit);
    }

    @Test
    void stockBuySell2() {
    	System.out.println("stockBuySell2");
    	int[] testPrices = {3,3,5,0,0,3,1,4};
		int actualprofit = buyingAndSellingStock.maxProfit(testPrices);
		int expectedProfit= 6;
		assertEquals(expectedProfit,actualprofit);
    }

    @Test
    void stockBuySell3() {
    	System.out.println("stockBuySell3");
    	int[] testPrices = {1,2,3,4,5};
		int actualprofit = buyingAndSellingStock.maxProfit(testPrices);
		int expectedProfit= 4;
		assertEquals(expectedProfit,actualprofit);
    }

    @Test
    void stockBuySell4() {
    	System.out.println("stockBuySell4");
    	int[] testPrices = {7,6,4,3,1};
		int actualprofit = buyingAndSellingStock.maxProfit(testPrices);
		int expectedProfit= 0;
		assertEquals(expectedProfit,actualprofit);
    }
    
    @Test
	public void stockBuySellWithNoPrice() {
		System.out.println("stockBuySellWithNoPrice");
		int[] testPrices = {};
		int actualprofit = buyingAndSellingStock.maxProfit(testPrices);
		int expectedProfit= 0;
		assertEquals(expectedProfit,actualprofit);
	}
    
    @Test
	public void stockBuySellWithOnePrice() {
		System.out.println("stockBuySellWithOnePrice");
		int[] testPrices = {1};
		int actualprofit = buyingAndSellingStock.maxProfit(testPrices);
		int expectedProfit= 0;
		assertEquals(expectedProfit,actualprofit);
	}
    
    @Test
   	public void stockBuySellWithTwoPrices() {
   		System.out.println("stockBuySellWithTwoPrices");
   		int[] testPrices = {1,2};
   		int actualprofit = buyingAndSellingStock.maxProfit(testPrices);
   		int expectedProfit= 1;
   		assertEquals(expectedProfit,actualprofit);
   	}
      
    @AfterEach
	public void teardown() {
		System.out.println("Teardown");
		buyingAndSellingStock = null;
	}

}
