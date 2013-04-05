package com.github.Artemish.LANPirism.event;

import java.util.ArrayList;

public class EventListener {
	
	public int eventID;
	public ArrayList<Trigger> triggers = new ArrayList<Trigger>();
	
	public EventListener(int eventID) {
		this.eventID = eventID;
	}
	
	public void subscribe (Trigger trigger) {
		if (!triggers.contains(trigger)) triggers.add(trigger);
	}
	
	public void pullTriggers(Event event) {
		for (Trigger trigger : triggers) {
			trigger.pull(event);
		}
	}
	
}
