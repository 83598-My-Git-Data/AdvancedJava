package com.sunbeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sunbeam.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController
{
	@Autowired
	private ProductService products;
	
	public ProductController() {
		System.out.println("in ctor " + getClass());
	}
	@GetMapping("/view")
	public String getBlogPostsByCategory(@RequestParam 
			double max,double min,Model modelAttributeMap)
	{
		System.out.println("in get within price Range of products - "+max+""+min);
		//invoke service method 
		modelAttributeMap.addAttribute("product_list",
				products.getProductsByCategoryNameWithinPriceRange(max, min));
		return "/products/view";//AVN - /WEB-INF/views/posts/view.jsp
				
	}
	

}
