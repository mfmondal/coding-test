package com.mondal.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class BuyingAndSellingStockMockitoTest {
	
	BuyingAndSellingStock buyingAndSellingStock = mock(BuyingAndSellingStock.class);
	
	@Test
	public void stockBuySell() {
		
		System.out.println("stockBuySell");
    	int[] testPrices = {3,3,5,0,0,3,1,4};
		when(buyingAndSellingStock.maxProfit(testPrices)).thenReturn(6);
		assertEquals(6, buyingAndSellingStock.maxProfit(testPrices));
		verify(buyingAndSellingStock).maxProfit(testPrices);
	}

}
