package com.simplelearn.mockito;

import java.util.List;
import java.util.stream.IntStream;

public class Portfolio {
public List<Stock> stocks;
	public StockService stockService;

	public List<Stock> getStock() {
		return stocks;
	}
	public void setStock(List<Stock> stock) {
		this.stocks = stock;
	}
	public StockService getStockService() {
		return stockService;
	}
	public void setStockService(StockService stockService) {
		this.stockService = stockService;
	}
	public double getMarketValue() {
		double marketprice=0.00;
		for(Stock stock:stocks) {
			marketprice+=stockService.getPrice(stock)*stock.getQuantity();
		}
		return marketprice;
	}
	

}

