package com.sunbeam.Dao;

import java.util.List;

import com.sunbeam.entities.Category;
import com.sunbeam.entities.Product;

public interface ProductDao 
{
	List<Product> getProductByPriceRange(double MaxPrice,double MinPrice);

}
