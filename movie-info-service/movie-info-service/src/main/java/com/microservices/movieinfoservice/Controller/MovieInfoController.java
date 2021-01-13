package com.microservices.movieinfoservice.Controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.movieinfoservice.model.MovieInfo;

@RestController
@RequestMapping("/movieinfo")
public class MovieInfoController {

	@RequestMapping("{movieId}")
	public MovieInfo getMovieInfo(@PathVariable("movieId") String movieId){
		if(movieId.equalsIgnoreCase("1001")) {
		return new MovieInfo(movieId, "WW84");
		}
		else
			return new MovieInfo(movieId, "Ludo");
	}
}
