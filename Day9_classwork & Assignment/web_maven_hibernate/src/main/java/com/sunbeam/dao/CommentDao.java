package com.sunbeam.dao;

import com.sunbeam.entities.Comment;
public interface CommentDao {
	
	String PostNewComment(Comment NewComment,Long CommenterId,Long PostId);

}
