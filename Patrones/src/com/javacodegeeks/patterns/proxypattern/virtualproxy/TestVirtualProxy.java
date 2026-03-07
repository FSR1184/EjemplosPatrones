package com.javacodegeeks.patterns.proxypattern.virtualproxy;

import java.util.List;
/**
 * Ejemplo extraído de javacodegeeks para estuadiar el patrón proxy
 * Se han realizado algunos cambios para que resulte más claro el ejemplo
 * La lista de contactos es un proxy, implementa la interfaz ContactList pero permite retrasar la creación de la lista de empleados hasta el momento en el que se soliciten por primera vez
 * Es decir hasta que no se invoca el método getEmployeeList de la interfaz ContactList no se crean en realidad los objetos de la lista (pero se puede utilizar el objeto Company sin problema)
 * @author irm
 *
 */
public class TestVirtualProxy {
       
	public static void main(String[] args) {
		ContactList contactList = new ContactListProxyImpl();
		Company company = new Company("ABC Company", "India", "+91-011-28458965", contactList);
		usoCompany(company);
		
		
		System.out.println("Primera vez que se invoca el método para solicitar el listado de empleados");
		
		List<Employee> empList = contactList.getEmployeeList();
		for(Employee emp : empList){
			System.out.println(emp);
		}
		System.out.println("Segunda invocación al método para solicitar el listado de empleados (no se vuelven a crear)");
			
		List<Employee>empList2 = contactList.getEmployeeList();
		for(Employee emp : empList2){
			System.out.println(emp);
		}
	}
	private static void usoCompany(Company company) {
		System.out.println("Se usa el objeto company sin problema, aunque aún la lista de contactos no se ha creado");
		
		System.out.println("Nombre de la empresa: "+company.getCompanyName());
		System.out.println("Dirección de la empresa: "+company.getCompanyAddress());
		System.out.println("Contacto con la empresa: "+company.getCompanyContactNo());		
		System.out.println("FIN usoCompany()\n==============================================");
	}
	
}
