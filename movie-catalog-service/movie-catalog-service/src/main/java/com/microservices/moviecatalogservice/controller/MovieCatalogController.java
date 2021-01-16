package com.microservices.moviecatalogservice.controller;





import java.util.List;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.microservices.moviecatalogservice.model.CatalogItem;
import com.microservices.moviecatalogservice.model.ListObjectOfMovieCatalog;
import com.microservices.moviecatalogservice.model.MovieInfo;
import com.microservices.moviecatalogservice.model.RatingListObject;

@RestController
@RequestMapping("/moviecatalog")
public class MovieCatalogController {

	@Autowired
	RestTemplate resttemplate;
	
	@Autowired
	WebClient.Builder webclientbuilder;
	
	@Autowired
	ListObjectOfMovieCatalog listofCatalogItems;
	
	@RequestMapping("/{userId}")
	public ListObjectOfMovieCatalog getCatalog(@PathVariable("userId")  String userId){
		
		//get all rated movieIds
		RatingListObject listofratings = webclientbuilder.build().get().uri("http://localhost:8084/rating/user/"+ userId)
				.retrieve().bodyToFlux(RatingListObject.class).blockLast();
		
		List<CatalogItem> listcatalogitem =  listofratings.getListofratings().stream().map(rating -> { 
	//MovieInfo movieInfo = resttemplate.getForObject("http://localhost:8083/movieinfo/"+ rating.getMovieid(), MovieInfo.class);
			
			MovieInfo movieInfo = webclientbuilder
		.build()
		.get()
		.uri("http://localhost:8083/movieinfo/"+ rating.getMovieid())
		.retrieve()
		.bodyToMono(MovieInfo.class)
		.block();
		return 	new CatalogItem(movieInfo.getMoviename(), "Drama", rating.getRating());
				})
				.collect(Collectors.toList());
		
		//ListObjectOfMovieCatalog listofCatalogItems = new ListObjectOfMovieCatalog();
				listofCatalogItems.setListofratings(listcatalogitem);
				return listofCatalogItems;
		
//		return Collections.singletonList(
//				new CatalogItem("Ludo", "Drama", 5));
	}
}
