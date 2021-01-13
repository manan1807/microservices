package com.microservices.moviecatalogservice.model;

import java.util.List;

public class RatingListObject {

private  List<Rating> listofratings;

public List<Rating> getListofratings() {
	return listofratings;
}

public void setListofratings(List<Rating> listofratings) {
	this.listofratings = listofratings;
}
}
