package com.javacodegeeks.patterns.adapterpattern.payd;

public interface PayD {
	
	public String getCustCardNo();
	public String getCardOwnerName();
	public String getCardExpDate();
	public int getCVVNo();
	public double getTotalAmount();
	
	public void setCustCardNo(String custCardNo);
	public void setCardOwnerName(String cardOwnerName);
	public void setCardExpDate(String cardExpMonth,String cardExpYear);
	public void setCVVNo(int cVVNo);
	public void setTotalAmount(double totalAmount);
}
