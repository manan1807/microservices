package com.microservices.ratingdataservice.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class RatingListObject {

private  List<Rating> listofratings;

public List<Rating> getListofratings() {
	return listofratings;
}

public void setListofratings(List<Rating> listofratings) {
	this.listofratings = listofratings;
}
}
