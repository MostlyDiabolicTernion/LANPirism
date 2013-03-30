package com.github.Artemish.LANPirism.event;

public class Trigger {
	
	public Event cause;
	public Action result;
	
	public Trigger(Event cause, Action result) {
		this.cause = cause;
		this.result = result;
		EventHub.addListener(cause.getID());
	}
	
	public void trigger() {
		result.act();
	}
	
	
	
}