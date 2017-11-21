
package com.xdev.rapidclipse.demo.webservices.dal;

import com.xdev.rapidclipse.demo.webservices.entities.Employee;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class Employee.
 * 
 * @see Employee
 */
public class EmployeeDAO extends JPADAO<Employee, Integer> {
	public EmployeeDAO() {
		super(Employee.class);
	}
}