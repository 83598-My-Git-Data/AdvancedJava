package com.sunbeam.dao;

import com.sunbeam.entities.BlogPost;
import com.sunbeam.entities.Comment;
import com.sunbeam.entities.User;

import static com.sunbeam.utils.HibernateUtils.getFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CommentDaoImpl implements CommentDao{

	@Override
	public String PostNewComment(Comment NewComment, Long CommenterId, Long PostId) {
		// TODO Auto-generated method stub
		
		String message ="adding post new comment failed";
		
		Session session=getFactory().getCurrentSession();
		
		Transaction tx=session.beginTransaction();
		
		
		try {
			User commenter=session.get(User.class, CommenterId);
					BlogPost post=session.get(BlogPost.class, PostId);
					
					if(commenter != null && post != null 
					&& commenter.getId() != post.getBlogger().getId())
			{
				//=> commenter n post exists !
				//5. establish uni dir associations
				NewComment.setCommenter(commenter);
				NewComment.setPost(post);
				//6. save the comment
				session.persist(NewComment);
				message="posted new comment!";
			}
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the exc to the caller
			throw e;
		}
		return message;
	}
		
	}
	
	


