
package com.xdev.rapidclipse.demo.webservices.dal;

import com.xdev.rapidclipse.demo.webservices.entities.Territory;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class Territory.
 * 
 * @see Territory
 */
public class TerritoryDAO extends JPADAO<Territory, String> {
	public TerritoryDAO() {
		super(Territory.class);
	}
}