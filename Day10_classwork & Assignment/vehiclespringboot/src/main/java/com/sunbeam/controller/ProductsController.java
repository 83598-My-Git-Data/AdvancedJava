package com.sunbeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.dto.ApiResponse;

import com.sunbeam.entities.Products;
import com.sunbeam.service.ProductsService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/Products")
public class ProductsController { 
	@Autowired
	private ProductsService productsService;
	
	
	public ProductsController()
	{
		System.out.println("in ctor"+getClass());
	}
	@PostMapping
	@Operation(description = "create  new Products")
	
	public ResponseEntity<?> addnewProducts(Products newproduct)
	{
		
		System.out.println("add new product"+newproduct);
		
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(productsService.addProducts(newproduct));
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse(e.getMessage()));
		}
		
	
		
	}
	@GetMapping("/{Id}")
	public ResponseEntity<?> getproductsid(@PathVariable Long Id)
	{
		System.out.println("in get products  " + Id);
		try {
			
			return ResponseEntity.ok(productsService.getproductdetailsbyid(Id));
		} catch (RuntimeException e) {
			System.out.println(e);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse(e.getMessage()));
		}
	}
	
@PutMapping("{Id}")
public ResponseEntity<?> updateCategory(@PathVariable Long Id, @RequestBody Products products)
{
	System.out.println("in update " + Id + " " + products);
	return ResponseEntity
			.ok(productsService
					.updateproductsDetails(Id, products));
}


}


