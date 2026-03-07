package com.javacodegeeks.patterns.proxypattern.virtualproxy;

import java.util.ArrayList;
import java.util.List;

public class ContactListImpl implements ContactList{
	private List<Employee> empList;
    ContactListImpl(){
    	empList = new ArrayList<Employee>(5);
		System.out.println("El objeto ContactListImpl sí crea los empleados");
		System.out.println("Crea Empleado A");
		empList.add(new Employee("Employee A", 2565.55, "SE"));
		System.out.println("Crea Empleado B");
		empList.add(new Employee("Employee B", 22574, "Manager"));
		System.out.println("Crea Empleado C");
		empList.add(new Employee("Employee C", 3256.77, "SSE"));
		System.out.println("Crea Empleado D");
		empList.add(new Employee("Employee D", 4875.54, "SSE"));
		System.out.println("Crea Empleado E");
		empList.add(new Employee("Employee E", 2847.01, "SE"));
    }
	@Override
	public List<Employee> getEmployeeList() {
		return empList;
	}
	
}
