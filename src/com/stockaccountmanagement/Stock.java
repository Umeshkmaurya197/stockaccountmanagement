package com.stockaccountmanagement;

public class Stock {
	public  String stockname;
	public int numberofshare;
	public double shareprice;
	public double totalShareprice=0;
	
	
	public Stock(String stockname, int numberofshare, double shareprice) {
		super();
		this.stockname = stockname;
		this.numberofshare = numberofshare;
		this.shareprice = shareprice;
	}
	public void calculateSharePrice(double totalshareprice2) {
		this.totalShareprice = totalshareprice2;
	}
	public String getStockname() {
		return stockname;
	}
	public void setStockname(String stockname) {
		this.stockname = stockname;
	}
	public int getNumberofshare() {
		return numberofshare;
	}
	public void setNumberofshare(int numberofshare) {
		this.numberofshare = numberofshare;
	}
	public double getShareprice() {
		return shareprice;
	}
	public void setShareprice(double shareprice) {
		this.shareprice = shareprice;
	}
	public double getTotalShareprice() {
		return totalShareprice;
	}
	public void setTotalShareprice(double totalShareprice) {
		this.totalShareprice = totalShareprice;
	}
	@Override
	public String toString() {
		return "stockname = " + stockname + ","
				+ " numberofshare = " + numberofshare + ","
						+ " shareprice = " + shareprice+ ","
								+ " totalShareprice = " + totalShareprice ;
	}
	
	
	
}
