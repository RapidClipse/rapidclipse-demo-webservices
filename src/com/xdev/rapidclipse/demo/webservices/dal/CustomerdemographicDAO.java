
package com.xdev.rapidclipse.demo.webservices.dal;

import com.xdev.dal.JPADAO;
import com.xdev.rapidclipse.demo.webservices.entities.Customerdemographic;

/**
 * Home object for domain model class Customerdemographic.
 * 
 * @see Customerdemographic
 */
public class CustomerdemographicDAO extends JPADAO<Customerdemographic, String> {
	public CustomerdemographicDAO() {
		super(Customerdemographic.class);
	}
}