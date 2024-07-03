package com.sunbeam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sunbeam.custom_exceptions.ResourceNotFoundException;
import com.sunbeam.dao.ProductsDao;
import com.sunbeam.dto.ApiResponse;

import com.sunbeam.entities.Products;
@Service
@Transactional

public class ProductsServiceImpl implements ProductsService {
	@Autowired
	ProductsDao productsDao;

	@Override
	public Products addProducts(Products product) {
		// TODO Auto-generated method stub
		Products persistentProducts=productsDao.save(product);
		
		return null;
	}

	@Override
	public Products getproductdetailsbyid(Long Id) {
		// return category details
		return productsDao.findById(Id) // Optional<Category>
				.orElseThrow(() -> new ResourceNotFoundException("Invalid Category ID!!!!"));

	}

	@Override
	public ApiResponse updateproductsDetails(Long id, Products product) {
		String mesg="Category Updation Failed : invalid id !!!!";
		if(productsDao.existsById(id))
		{
			productsDao.save(product);
			mesg="products has been updated successfully";
		}
		return new ApiResponse(mesg);
	}
	
	
	

}
