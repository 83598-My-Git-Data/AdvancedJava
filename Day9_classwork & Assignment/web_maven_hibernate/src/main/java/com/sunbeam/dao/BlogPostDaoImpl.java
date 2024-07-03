package com.sunbeam.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sunbeam.entities.BlogPost;
import com.sunbeam.entities.Category;
import com.sunbeam.entities.User;

import static com.sunbeam.utils.HibernateUtils.getFactory;

public class BlogPostDaoImpl implements BlogPostDao {

	@Override
	public String createNewPost(BlogPost newPost, Long categoryId,Long BloggerId) {
		// TODO Auto-generated method stub
		
		String mess="adding blogspost failed";
		
		
		Session session=getFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		
		try {
			Category category=session.get(Category.class,categoryId);
		    User blogger=session.get(User.class, BloggerId);
					
					if (category != null ) {
						// category : persistent n blogger : persistet
						// establish bi dir asso between Category n blog post
						category.addBlogPost(newPost);
						// modifying the state of PERSISTENT Entity
						newPost.setBlogger(blogger);//establish uni dir association between BlogPost *--->1 User
						
						// session.persist(newPost); NO longer required : since cascading is added !
						mess = "Added new blog post to the category !";
					}
					tx.commit();// Hibernate performs - auto dirty checking -sees new blog post entity -> insert
								// query
				} catch (RuntimeException e) {
					if (tx != null)
						tx.rollback();
					// re throw the exc to the caller
					throw e;
				}
				return mess;
			


		
	}

	@Override
	public String removeBlog(Long catId, Long blogId) {
		// TODO Auto-generated method stub
		return null;
	}

}
