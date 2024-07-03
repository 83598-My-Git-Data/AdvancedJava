package com.sunbeam.tester;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.sunbeam.dao.CommentDao;
import com.sunbeam.dao.CommentDaoImpl;
import com.sunbeam.entities.Comment;

import static com.sunbeam.utils.HibernateUtils.getFactory;


public class PostNewComment {

	public static void main(String[] args)
	{
		try(SessionFactory sf=getFactory(); Scanner sc=new Scanner(System.in))
		{
			CommentDao dao=new CommentDaoImpl();
			System.out.println("Enter comment text , rating , "
					+ "commenter id n blog post id");
			System.out.println(dao.PostNewComment(new Comment(sc.next(), sc.nextInt()),sc.nextLong(), sc.nextLong()));
		}
	}
}
