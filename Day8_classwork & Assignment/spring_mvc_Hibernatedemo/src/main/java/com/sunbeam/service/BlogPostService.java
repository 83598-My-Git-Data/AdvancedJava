package com.sunbeam.service;

import java.util.List;

import com.sunbeam.entities.BlogPost;

public interface BlogPostService {
	//addd a method to list posts by category
	List<BlogPost> getPostsBycategoryName(String catName);
	
	

}
