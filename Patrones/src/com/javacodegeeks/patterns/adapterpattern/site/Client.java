package com.javacodegeeks.patterns.adapterpattern.site;

import com.javacodegeeks.patterns.adapterpattern.payd.PayD;

/**
 * El cliente está preparado para manejar un objeto que implemente la interfaz PayD, que se le pasa en el constructor
 * No tiene ningún conocimiento de la clase XpayImpl ni de su interfaz
 * @author irm
 *
 */
public class Client {
	PayD myPayD;
	
	Client (PayD payDInstance){
		myPayD=payDInstance;
	}
public void testGetters(){	
		System.out.println(myPayD.getCardOwnerName());
		System.out.println(myPayD.getCustCardNo());
		System.out.println(myPayD.getCardExpDate());
		System.out.println(myPayD.getCVVNo());
		System.out.println(myPayD.getTotalAmount());
	}
public void testSetters() {
	myPayD.setCustCardNo("4789565874102365");
	myPayD.setCardOwnerName("Max Warner");
	myPayD.setCardExpDate("09","2021");
	myPayD.setCVVNo(235);
	myPayD.setTotalAmount(2565.23);
}
}
