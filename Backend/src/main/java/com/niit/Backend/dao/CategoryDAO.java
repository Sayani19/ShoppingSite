package com.niit.Backend.dao;

import java.util.List;

import com.niit.Backend.dto.Category;

public interface CategoryDAO 
{

	Category getCategory(int id);
	List<Category> categoryList();
	boolean insert(Category category);
	boolean update(Category category);
	boolean delete(Category category);
		
}