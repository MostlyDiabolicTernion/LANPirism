package com.github.Artemish.LANPirism.event;

public class Trigger  {
	
	public int causeID;
	public Action result;
	public int triggerID;
	
	public Trigger(int causeID, Action result) {
		this.causeID = causeID;
		this.result = result;
		triggerID = EventHub.getNewTriggerID();
		EventHub.subscribe(this);
	}
	
	public void pull(Event event) {
		result.act(event);
	}
	
}