
package com.xdev.rapidclipse.demo.webservices.dal;

import com.xdev.dal.JPADAO;
import com.xdev.rapidclipse.demo.webservices.entities.Product;

/**
 * Home object for domain model class Product.
 * 
 * @see Product
 */
public class ProductDAO extends JPADAO<Product, Integer> {
	public ProductDAO() {
		super(Product.class);
	}
}