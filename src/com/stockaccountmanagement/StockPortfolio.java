package com.stockaccountmanagement;

import java.io.FileWriter;

import com.google.gson.Gson;

public class StockPortfolio {
	public int numofstock=0;
	public Stock[] stock;
	public StockPortfolio() {
		stock = new Stock[5]; 
	}
	
	public void addStock(String stockname, int noofShare, double shareprice) {
		stock[numofstock] = new Stock(stockname,noofShare,shareprice);
		numofstock++;
		
	}
	public void computeSharePriceData() {
		for(int i = 0; i <numofstock ; i++ ) {
			stock[i].calculateSharePrice(this.computeSharePrice(stock[i]));
			System.out.println(stock[i]);
		}
	}
	
	public double computeSharePrice(Stock stock ) {
		double totalSharePrice = stock.shareprice * stock.numberofshare;
		return totalSharePrice;
	}
	public static void main (String [] args) {
		  StockPortfolio stockPortfolio = new StockPortfolio();  
		  
		  stockPortfolio.addStock(" Dmart ", 30, 11.1);
		  stockPortfolio.addStock(" TATA ", 20, 23.4);
		  stockPortfolio.addStock(" Bata ", 40, 13.6);
		  stockPortfolio.computeSharePriceData();
		  
		  Gson gson = new Gson();
			String json = gson.toJson(stockPortfolio);
			try {
				FileWriter writer = new FileWriter("D:/Code/stockaccountmanagement/Stock.json"); 
				writer.write(json);
				writer.close();
			}
			catch(Exception e)
			{
				System.out.println("Exception : "+e);
			}	
			
			
		 
	}
}
 