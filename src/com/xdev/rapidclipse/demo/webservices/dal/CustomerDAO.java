
package com.xdev.rapidclipse.demo.webservices.dal;

import com.xdev.rapidclipse.demo.webservices.entities.Customer;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class Customer.
 * 
 * @see Customer
 */
public class CustomerDAO extends JPADAO<Customer, String> {
	public CustomerDAO() {
		super(Customer.class);
	}
}