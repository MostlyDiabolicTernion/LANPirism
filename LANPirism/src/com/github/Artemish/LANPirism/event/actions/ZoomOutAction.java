package com.github.Artemish.LANPirism.event.actions;

import com.github.Artemish.LANPirism.event.Action;
import com.github.Artemish.LANPirism.event.Event;
import com.github.Artemish.LANPirism.game.Map;

public class ZoomOutAction implements Action {
	
	private Map gameMap;
	
	public ZoomOutAction (Map gameMap) {
		this.gameMap = gameMap;
	}
	
	public void act(Event e) {
		gameMap.scale *= 0.9;
	}
}
