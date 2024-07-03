package com.sunbeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sunbeam.service.BlogPostService;

@Controller
@RequestMapping("/posts")
public class BlogPostcontroller {
	
	@Autowired//depcy -servicelayer if
	
	private BlogPostService blogpostservice;
	
	
	public BlogPostcontroller()
	{
		System.out.println("in ctor"+getClass());
		
		
		
	}
	//url-http://host:port/ctx_pat/hpost/view?categoryName=hsdg
			//method get 
	//controller dependant on service so service 
	//service is a dependancy
	//controller is a dependant 
	
@GetMapping("/view")
public String getBlogPostsByCategory(@RequestParam String categoryName,Model modelattributeMap)
{
	System.out.println("oin get blog posts"+categoryName);
	modelattributeMap.addAttribute("blog_list "+ blogpostservice.getPostsBycategoryName(categoryName));
	
	return "/posts/view";
	
}
	
	
	

}
