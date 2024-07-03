//package com.sunbeam.dao;
//
//
//
//import java.io.Serializable;
//
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//
//import com.sunbeam.entities.Category;
//import com.sunbeam.entities.Products;
//import static com.sunbeam.utils.HibernateUtils.getFactory;
//
//
//
//public class ProductDaoImpl implements ProductDao {
//	public String addProduct(Long categoryId,Products product) {
//		String message = "product insertion failed !..";
//		Session session = getFactory().getCurrentSession();
//		Transaction tx = session.beginTransaction();
//		try {
//			//3.get category from its id 
//			Category category=session.get(Category.class, categoryId);
//			if(category!=null)
//			{
//				
//				//valid category -persistent
//				//4.establish bi dir association  between category and products 
//				category.addProduct(product);//state of the category changes
//				//session.persist(product)//is this required no
//				message ="addded th e product ";
//			}
//			
//			tx.commit();//sesssion flush()->dirty checking category is modified new product entity added 
//			//hibernate : automatically inserts the products 
//			
//		} catch (RuntimeException e) {
//			tx.rollback();
//			throw e;
//		}
//
//		return message;
//	}
//
//}
