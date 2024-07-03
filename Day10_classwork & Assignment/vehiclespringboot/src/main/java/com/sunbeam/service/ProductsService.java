package com.sunbeam.service;

import com.sunbeam.dto.ApiResponse;
import com.sunbeam.entities.Products;

public interface ProductsService {
	Products addProducts (Products product);
	Products getproductdetailsbyid(Long id);
	ApiResponse updateproductsDetails(Long id,Products product);
	

}
