package com.sunbeam.Dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.sunbeam.entities.Category;
import com.sunbeam.entities.Product;
@Repository
public class ProductDaoImpl implements ProductDao
{

	@Autowired
	private SessionFactory factory;
	@Override
	public List<Product> getProductByPriceRange(double MaxPrice, double MinPrice)
	{
		String jpql="select p from Product p where p.price between :Max and :Min ";
		
		return factory.getCurrentSession() //Session
				.createQuery(jpql,Product.class).setParameter("Max",MaxPrice).setParameter("Min", MinPrice)
				.getResultList();
	}

}
