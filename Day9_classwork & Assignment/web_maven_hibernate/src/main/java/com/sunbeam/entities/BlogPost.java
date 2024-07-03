package com.sunbeam.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="posts")
public class BlogPost extends BaseEntity {
	@Column(length=30,unique=true)
	private String title;
	private String description;
	
	private String contents;
	
	@ManyToOne
	@JoinColumn(name="category_id",nullable=false)
	private Category selectedCategory;
	
	public User getBlogger() {
		return blogger;
	}

	public void setBlogger(User blogger) {
		this.blogger = blogger;
	}

	@ManyToOne
	@JoinColumn(name="Author_id",nullable=false)
	
	private User blogger;
	
	public BlogPost() {}

	public BlogPost(String title, String description, String contents) {
		super();
		this.title = title;
		this.description = description;
		this.contents = contents;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Category getSelectedCategory() {
		return selectedCategory;
	}

	public void setSelectedCategory(Category selectedCategory) {
		this.selectedCategory = selectedCategory;
	}

	@Override
	public String toString() {
		return "BlogPost [title=" + title + ", description=" + description + ", contents=" + contents
				+ ", selectedCategory=" + selectedCategory + ", blogger=" + blogger + "]";
	}


	




	
	
	
	

}
