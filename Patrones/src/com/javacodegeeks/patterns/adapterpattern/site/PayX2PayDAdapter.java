/**
 * 
 */
package com.javacodegeeks.patterns.adapterpattern.site;

import com.javacodegeeks.patterns.adapterpattern.payd.PayD;
import com.javacodegeeks.patterns.adapterpattern.xpay.Xpay;

/**
 * El objeto adaptador implementa la interfaz que espera el cliente, pero encapsula un objeto XpayImpl, que es la implementación de la que se dispone y que implementa la interfaz Xpay
 * Dado que la clase XpayImpl es muy simple la creación de un adaptador para reutilizar esta implementación parece poco justificada
 * Si XpayImpl fuera más compleja tendría más sentido la creación de un adaptador
 * @author irm
 *
 */
public class PayX2PayDAdapter implements PayD {
	private Xpay myXpay;
	
	PayX2PayDAdapter(){
		myXpay=new XpayImpl();
	}

	@Override
	public String getCustCardNo() {
	
		return myXpay.getCreditCardNo();
	}

	@Override
	public String getCardOwnerName() {
	
		return myXpay.getCustomerName();
	}

	@Override
	public String getCardExpDate() {
	
		return myXpay.getCardExpMonth()+'/'+myXpay.getCardExpYear();
	}

	@Override
	public int getCVVNo() {
		return myXpay.getCardCVVNo().intValue();
	}

	@Override
	public double getTotalAmount() {
		return myXpay.getAmount().doubleValue();
	}

	@Override
	public void setCustCardNo(String custCardNo) {
		myXpay.setCreditCardNo(custCardNo);
	}

	@Override
	public void setCardOwnerName(String cardOwnerName) {
		myXpay.setCustomerName(cardOwnerName);

	}

	@Override
	public void setCardExpDate(String cardExpMonth,String cardExpYear) {
		myXpay.setCardExpMonth(cardExpMonth);
		myXpay.setCardExpYear(cardExpYear);

	}

	@Override
	public void setCVVNo(int cVVNo) {
		myXpay.setCardCVVNo(Short.valueOf(String.valueOf(cVVNo)));

	}

	@Override
	public void setTotalAmount(double totalAmount) {
		myXpay.setAmount(Double.valueOf(totalAmount));

	}

}
