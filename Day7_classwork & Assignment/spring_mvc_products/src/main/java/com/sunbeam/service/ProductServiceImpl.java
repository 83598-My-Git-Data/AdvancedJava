package com.sunbeam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.Dao.ProductDao;
import com.sunbeam.entities.Product;
@Service
@Transactional
public class ProductServiceImpl implements ProductService 
{
	@Autowired
	private ProductDao productDao;

	@Override
	public List<Product> getProductsByCategoryNameWithinPriceRange(double max, double min) 
	{
		// TODO Auto-generated method stub
		return productDao.getProductByPriceRange(max, min);
	}

}
