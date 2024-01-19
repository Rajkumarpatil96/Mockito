package com.simplelearn.mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class PortfolioTester {

Portfolio portfolio;

 StockService stockService;
	public static void main(String[] args) {
		PortfolioTester portfolioTester=new PortfolioTester();
		portfolioTester.setUp();
		System.out.println(portfolioTester.testMarketvalue()?"pass":"fail");
		
	}
	
	public void setUp() {
		portfolio=new Portfolio();
		//create the mock object of stockservice
		//stockService=mock(StockService.class);
		MockitoAnnotations.initMocks(this);
		
		//set the stockservice to the portfolio
		portfolio.setStockService(stockService);
	}
	
public boolean testMarketvalue() {
	//create list of stock can added to the portfolio

	List<Stock>stock=new ArrayList<Stock>();
//	Stock googleStock=new Stock("1", "Google", 10);
//	Stock mocrosoft=new Stock("2", "Microsoft", 1000);
	stock.add(new Stock("1", "Google", 10));
	stock.add(new Stock("2", "Microsoft", 1000));
	//add stock to portfolio
	portfolio.setStock(stock);
	
	//mock te behaviour of stock service to return the value of various stock
	when(stockService.getPrice(stock.get(0))).thenReturn(50.00);
	when(stockService.getPrice(stock.get(1))).thenReturn(1000.00);
	double marketvalue=portfolio.getMarketValue();
	return marketvalue==100500.0;
}

}
