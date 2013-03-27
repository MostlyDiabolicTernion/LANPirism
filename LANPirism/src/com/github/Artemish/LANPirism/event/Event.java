package com.github.Artemish.LANPirism.event;

public class Event {
	
	private int eventID;
	// TODO Flesh out all other properties of the Event class, maybe create subtypes
	
	public Event(int eventID) {
		this.eventID = eventID;
		// Assign all other properties
		EventHub.notify(this);
	}
	
	public int getID() {
		return eventID;
	}
	
	
	
	
	
}
