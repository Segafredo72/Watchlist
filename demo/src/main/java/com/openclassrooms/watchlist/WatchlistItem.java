package com.openclassrooms.watchlist;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@GoodMovie
public class WatchlistItem {

	private Integer id;
	private String rating; 
	
	@Priority
	private String priority;
	
	@Size(max=50,  message="Comment should be maximum 50 characters")
	private String comment;
	
	@NotBlank( message="Please enter the title")
	private String title;
	
	public WatchlistItem(Integer id, String title, String rating, String priority, String comment) {
		super();
		this.id = id;
		this.title = title;
		this.rating = rating;
		this.priority = priority;
		this.comment = comment;
	}

	public WatchlistItem() {
		 
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	
	
}
