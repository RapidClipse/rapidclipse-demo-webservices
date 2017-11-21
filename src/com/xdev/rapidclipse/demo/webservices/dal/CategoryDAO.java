
package com.xdev.rapidclipse.demo.webservices.dal;

import com.xdev.rapidclipse.demo.webservices.entities.Category;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class Category.
 * 
 * @see Category
 */
public class CategoryDAO extends JPADAO<Category, Integer> {
	public CategoryDAO() {
		super(Category.class);
	}
}