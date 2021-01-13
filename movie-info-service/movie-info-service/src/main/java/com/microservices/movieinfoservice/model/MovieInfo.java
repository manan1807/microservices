package com.microservices.movieinfoservice.model;

public class MovieInfo {

	private String movieId;
	private String moviename;
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public MovieInfo(String movieId, String moviename) {
		super();
		this.movieId = movieId;
		this.moviename = moviename;
	}
}
