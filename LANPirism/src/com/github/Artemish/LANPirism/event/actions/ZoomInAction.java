package com.github.Artemish.LANPirism.event.actions;

import com.github.Artemish.LANPirism.event.Action;
import com.github.Artemish.LANPirism.event.Event;
import com.github.Artemish.LANPirism.game.Map;

public class ZoomInAction implements Action {
	
	private Map gameMap;
	
	public ZoomInAction (Map gameMap) {
		this.gameMap = gameMap;
	}
	
	public void act(Event e) {
		gameMap.scale *= 1.1;
	}
	
	
	
	
}