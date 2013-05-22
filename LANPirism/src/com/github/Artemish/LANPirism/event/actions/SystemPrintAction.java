package com.github.Artemish.LANPirism.event.actions;

import com.github.Artemish.LANPirism.event.Action;
import com.github.Artemish.LANPirism.event.Event;

public class SystemPrintAction implements Action {
	
	public String message;
	
	public SystemPrintAction(String message) {
		this.message = message;
	}
	
	public void act(Event event) {
		System.out.println(message);
	}
	
}