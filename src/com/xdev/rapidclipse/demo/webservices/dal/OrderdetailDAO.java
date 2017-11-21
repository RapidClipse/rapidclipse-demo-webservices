
package com.xdev.rapidclipse.demo.webservices.dal;

import com.xdev.rapidclipse.demo.webservices.entities.Orderdetail;
import com.xdev.dal.JPADAO;
import com.xdev.rapidclipse.demo.webservices.entities.OrderdetailId;

/**
 * Home object for domain model class Orderdetail.
 * 
 * @see Orderdetail
 */
public class OrderdetailDAO extends JPADAO<Orderdetail, OrderdetailId> {
	public OrderdetailDAO() {
		super(Orderdetail.class);
	}
}