package com.simplelearn.mockito;

public class Stock {
private String StockId;
private String name;
private int quantity;
public Stock(String stockId, String name, int quantity) {
	super();
	StockId = stockId;
	this.name = name;
	this.quantity = quantity;
}
public String getStockId() {
	return StockId;
	
}
public void setStockId(String stockId) {
	StockId = stockId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}

}
