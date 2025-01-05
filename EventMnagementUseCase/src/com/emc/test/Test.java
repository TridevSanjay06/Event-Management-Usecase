package com.emc.test;
import com.emc.entities.Event;
import com.emc.entities.EventOrganizer;



public class Test {

	public static void main(String[] args) {
		
		EventOrganizer organizer = new EventOrganizer();
		
		organizer.setId(123l);
		organizer.setName("sanjay");
		
	System.out.println(organizer);
	System.out.println(organizer.getName());
	
	Event event = new Event(456l, "IPhone 100 Launch", "Grand Launch");
	System.out.println(event.getdiscription);


	}
}
	