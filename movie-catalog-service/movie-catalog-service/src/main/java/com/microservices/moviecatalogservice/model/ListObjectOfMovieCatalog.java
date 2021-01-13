package com.microservices.moviecatalogservice.model;

import java.util.List;

public class ListObjectOfMovieCatalog {

private  List<CatalogItem> listofCatalogItems;

public List<CatalogItem> getListofratings() {
	return listofCatalogItems;
}

public void setListofratings(List<CatalogItem> listofCatalogItems) {
	this.listofCatalogItems = listofCatalogItems;
}
}
