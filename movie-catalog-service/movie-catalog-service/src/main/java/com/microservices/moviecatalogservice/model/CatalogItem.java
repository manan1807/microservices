package com.microservices.moviecatalogservice.model;

public class CatalogItem {

	private String moviename;
	private String moviedesc;
	private int rating;
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getMoviedesc() {
		return moviedesc;
	}
	public CatalogItem(String moviename, String moviedesc, int rating) {
		super();
		this.moviename = moviename;
		this.moviedesc = moviedesc;
		this.rating = rating;
	}
	public void setMoviedesc(String moviedesc) {
		this.moviedesc = moviedesc;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
}