package com.microservices.ratingdataservice.model;

public class Rating {

	
	private String movieid;
	private int rating;
	public String getMovieid() {
		return movieid;
	}
	public void setMovieid(String movieid) {
		this.movieid = movieid;
	}
	public Rating(String movieid, int rating) {
		super();
		this.movieid = movieid;
		this.rating = rating;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
}
