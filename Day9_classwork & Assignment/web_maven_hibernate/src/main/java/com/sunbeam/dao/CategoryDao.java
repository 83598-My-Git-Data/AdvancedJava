package com.sunbeam.dao;

import com.sunbeam.entities.Category;

public interface CategoryDao {
	String addNewCategory(Category category );
	Category getCategoryDetails(String Categoryname);
	Category getCategoryAndPostDetails(String categoryName);

	Category getCategoryDetailsById(Long nextLong);
	

}
