package com.javacodegeeks.patterns.proxypattern.virtualproxy;

import java.util.List;

public class ContactListProxyImpl implements ContactList{

	private ContactList contactList;
	
	@Override
	public List<Employee> getEmployeeList() {
		if(contactList == null){
			System.out.println("La primera vez que se invoca el proxy crea el objeto ContactListImpl, y este sí crea la lista de empleados...");
			contactList = new ContactListImpl();
		}
		return contactList.getEmployeeList();
	}
	

}
