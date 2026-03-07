package com.javacodegeeks.patterns.adapterpattern.site;

import com.javacodegeeks.patterns.adapterpattern.payd.PayD;

/**
 * Clase principal (main) para ejemplificar el patrón adaptador
 * El cliente está preparado para trabajar con la interfaz PayD, pero la implementación disponible (XpayImpl) implementa la interfaz Xpay
 * Pasa al cliente el objeto adaptador
 * Ejemplo de javacodegeeks pero modificado para que el ejemplo sea más claro
 * @author irm
 *
 */
public class RunAdapterExample {

	public static void main(String[] args) {
		
		// Crea el objeto adaptador y el cliente
		
		PayD payD = new PayX2PayDAdapter();
		Client cliente=new Client(payD);
		cliente.testSetters();
		cliente.testGetters();
	}
	
}
