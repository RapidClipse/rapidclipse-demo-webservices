
package com.xdev.rapidclipse.demo.webservices.dal;

import com.xdev.dal.JPADAO;
import com.xdev.rapidclipse.demo.webservices.entities.Shipper;

/**
 * Home object for domain model class Shipper.
 * 
 * @see Shipper
 */
public class ShipperDAO extends JPADAO<Shipper, Integer> {
	public ShipperDAO() {
		super(Shipper.class);
	}
}