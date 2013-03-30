package com.github.Artemish.LANPirism.event.actions;

import com.github.Artemish.LANPirism.event.Action;

public class SystemPrintAction implements Action {
	
	public String message;
	
	public SystemPrintAction(String message) {
		this.message = message;
	}
	
	public void act() {
		System.out.println(message);
	}
	
}