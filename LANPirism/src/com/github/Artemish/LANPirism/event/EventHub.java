package com.github.Artemish.LANPirism.event;

import java.util.HashMap;


public class EventHub {
	
	// Here, the integer is the eventID
	public static HashMap<Integer, EventListener> listeners =
			new HashMap<Integer, EventListener>();
	
	
	
	public static void notify(Event event) {
		if (listeners.containsKey(event.getID())) {
			listeners.get(event.getID()).notify(event);
		}
			
	}
	
	public static boolean hasListener(int eventID) {
		return (listeners.containsKey(eventID));		
	}
	
	
	public static void addListener(int eventID) {
		if (!hasListener(eventID)) {
			listeners.put(eventID, new EventListener(eventID));
		}
	}
	
	
}
