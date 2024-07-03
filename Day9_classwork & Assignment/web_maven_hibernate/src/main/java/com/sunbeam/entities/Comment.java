package com.sunbeam.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="Comment",uniqueConstraints=
@UniqueConstraint(columnNames= {"Commenter_Id","Post_id"}))
public class Comment extends BaseEntity {
	@Column(name="comment_text" ,length=20)
	private String commenttext;
	private int rating;
	
	@ManyToOne 
	@JoinColumn(name="post_id",nullable=false)
	private BlogPost post;
	
	@ManyToOne 
	@JoinColumn(name="commenter_id",nullable=false)
	private User commenter;

	public String getCommenttext() {
		return commenttext;
	}

	public void setCommenttext(String commenttext) {
		this.commenttext = commenttext;
	}

	public int getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return "Comment [commenttext=" + commenttext + ", rating=" + rating + ", post=" + post + ", commenter="
				+ commenter + "]";
	}

	public Comment(String commenttext, int rating) {
		super();
		this.commenttext = commenttext;
		this.rating = rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public BlogPost getPost() {
		return post;
	}

	public void setPost(BlogPost post) {
		this.post = post;
	}

	public User getCommenter() {
		return commenter;
	}

	public void setCommenter(User commenter) {
		this.commenter = commenter;
	}
	
	
	

	
	
}
