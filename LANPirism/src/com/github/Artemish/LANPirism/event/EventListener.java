package com.github.Artemish.LANPirism.event;

public class EventListener {
	
	public int eventID;
	
	public EventListener(int eventID) {
		this.eventID = eventID;
	}	
	
	public void notify(Event event) {
		System.out.println("Event with ID " + event.getID() + " recorded!");
	}	
	
	
}
