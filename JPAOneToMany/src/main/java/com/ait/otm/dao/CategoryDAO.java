package com.ait.otm.dao;

import com.ait.otm.entities.CategoryEntity;

public interface CategoryDAO {
	
	void saveCategory(CategoryEntity entity);
	
	CategoryEntity fetchCategory(Integer categoryId);
	
	void removeCategory(Integer categoryId);

}
