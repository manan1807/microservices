package com.microservices.ratingdataservice.controller;


import java.util.Arrays;
import java.util.List;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.ratingdataservice.model.Rating;
import com.microservices.ratingdataservice.model.RatingListObject;

@RestController
@RequestMapping("/rating")
public class RatingDataController {

	@RequestMapping("/{movieId}")
	public Rating getRatingOfMovie(@PathVariable("movieId") String movieId){
		
		return new Rating(movieId, 4); 
	}
	
	@RequestMapping("user/{userId}")
	public RatingListObject getRatingOfMovies(@PathVariable("userId") String userId){
		RatingListObject listofratings = new RatingListObject();
		List<Rating> ratings = Arrays.asList(
				new Rating("1001", 4),
				new Rating("1002", 5) );
		
		 listofratings.setListofratings(ratings);
		 return listofratings;
	}
}
