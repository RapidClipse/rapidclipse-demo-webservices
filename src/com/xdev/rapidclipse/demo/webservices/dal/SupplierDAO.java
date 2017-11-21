
package com.xdev.rapidclipse.demo.webservices.dal;

import com.xdev.rapidclipse.demo.webservices.entities.Supplier;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class Supplier.
 * 
 * @see Supplier
 */
public class SupplierDAO extends JPADAO<Supplier, Integer> {
	public SupplierDAO() {
		super(Supplier.class);
	}
}