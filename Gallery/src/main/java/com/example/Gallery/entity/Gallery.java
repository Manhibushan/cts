package com.example.Gallery.entity;

import java.util.List;

public class Gallery {
private int id;
private List<Object> images;
public Gallery() {
	super();
	// TODO Auto-generated constructor stub
}
public Gallery(int galleryid) {
	super();
	this.id = galleryid;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public List<Object> getImages() {
	return images;
}
public void setImages(List<Object> images) {
	this.images = images;
}





}


