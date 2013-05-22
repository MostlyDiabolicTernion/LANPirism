package com.github.Artemish.LANPirism.event;

public class Event {
	
	protected int eventID;
	
	public Event(int eventID) {
		this.eventID = eventID;
		// Assign all other properties in subtype constructors
	}
	
	public int getID() {
		return eventID;
	}
	
	
	
}
