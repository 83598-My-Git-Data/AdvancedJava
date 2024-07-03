package com.sunbeam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunbeam.dao.BlogPostDao;
import com.sunbeam.entities.BlogPost;

@Service//spring bean holding B.L ,singleton end eager
@Transactional//for autpmatic 
public class BlogPostServiceImpl implements BlogPostService {

	@Autowired//byytype
	private BlogPostDao blogpostdao;//inject interface of dao dont inject implemnehtation class
	@Override
	public List<BlogPost> getPostsBycategoryName(String catName) {
		// TODO Auto-generated method stub
		//invoke dao method to het list of blog post
		return blogpostdao.getBlogPostByCategory(catName);
	}

}
