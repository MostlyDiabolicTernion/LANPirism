package com.github.Artemish.LANPirism.event;

import java.util.ArrayList;
import java.util.HashMap;


/*
 * TODO Make all these members not static (so that instances of EventHub can be created)
 */
public class EventHub {
	
	private static int latestTrigger = 0;
	
	// Maps eventIDs to EventListeners
	public static HashMap<Integer, EventListener> listeners =
			new HashMap<Integer, EventListener>();
	
	private static ArrayList<Trigger> triggerList = new ArrayList<Trigger>();
	
	public static void process(Event event) {
		EventListener l = listeners.get(event.getID());
		if(l != null) l.pullTriggers(event);
	}
	
	public static void subscribe (Trigger trigger) {
		EventListener listener = listeners.get(trigger.causeID);
		if(listener == null)
			addListener(listener = new EventListener(trigger.causeID));
		listener.subscribe(trigger);
	}
	
	public static void addListener(EventListener listener) {
		if(!listeners.containsKey(listener.eventID))
			listeners.put(listener.eventID, listener);
	}
	
	public static void addTrigger(Trigger trigger) {
		triggerList.add(trigger);
	}
	
	public static int getNewTriggerID() {
		return latestTrigger++;
	}
	
}