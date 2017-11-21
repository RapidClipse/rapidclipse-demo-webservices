
package com.xdev.rapidclipse.demo.webservices.dal;

import com.xdev.dal.JPADAO;
import com.xdev.rapidclipse.demo.webservices.entities.Order;

/**
 * Home object for domain model class Order.
 * 
 * @see Order
 */
public class OrderDAO extends JPADAO<Order, Integer> {
	public OrderDAO() {
		super(Order.class);
	}
}