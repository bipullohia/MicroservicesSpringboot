package com.bipullohia.moviecatalogservice.models;

public class Movie {

	private String id;
	private String name;
	
	//Since we are creating a parameterized constructor, we need an empty one too if we use Java unmarshalling from string
	public Movie() {
	}
	
	public Movie(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
