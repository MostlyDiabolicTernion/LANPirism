package com.github.Artemish.LANPirism.event;

import java.util.HashMap;


public class EventHub {
	
	static int latestTrigger = 0;
	
	// Here, the key is the eventID
	public static HashMap<Integer, EventListener> listeners =
			new HashMap<Integer, EventListener>();
	
	public static void process(Event event) {
		try { listeners.get(event.getID()).pullTriggers(event); }
		catch (NullPointerException e) {}
	}
	
	public static void subscribe (Trigger trigger) {
		try { listeners.get(trigger.causeID).subscribe(trigger); }
		catch (NullPointerException e) {
			addListener(trigger.causeID);
			listeners.get(trigger.causeID).subscribe(trigger);
		}
	}
	
	
	public static void addListener(int eventID) {
		if (!listeners.containsKey(eventID)) {
			listeners.put(eventID, new EventListener(eventID));
		}
	}
	
	public static int getNewTriggerID() {
		return latestTrigger++;
	}
	
}