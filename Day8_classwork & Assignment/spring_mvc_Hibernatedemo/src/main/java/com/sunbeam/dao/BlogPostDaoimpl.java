package com.sunbeam.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sunbeam.entities.BlogPost;
@Repository//to tell sc-following class is a spring bean(singleton n eager containing c=dao
public class BlogPostDaoimpl implements BlogPostDao {
//depcy
@Autowired
private SessionFactory factory;

@Override
	public List<BlogPost> getBlogPostByCategory(String categoryName) {
		// TODO Auto-generated method stub
	String jpql="select p from BlogPost p where p.selectedCategory.categoryName=:cat";
		return factory.getCurrentSession()//session
		.createQuery(jpql,BlogPost.class)
		.setParameter("cat",categoryName)
		.getResultList();
		
		
	}
	
	

}
