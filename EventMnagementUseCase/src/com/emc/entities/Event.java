package com.emc.entities;

public class Event extends EMBase{
	
	
	private String discription;
	private String starttime;
	private String endtime;
	private Boolean started;
	
	public Event(Long id, String name, String discription) {
		this.id = id;
		this.name = name;
		this.discription = discription;
		
	}

}
