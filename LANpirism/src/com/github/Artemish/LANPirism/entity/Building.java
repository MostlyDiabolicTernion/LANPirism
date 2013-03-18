package com.github.Artemish.LANPirism.entity;

import org.newdawn.slick.SlickException;

public class Building extends Entity {

	public Building(boolean hasHealth, boolean canMove, boolean hasOwner,
			float x, float y, String imagePath) throws SlickException {
		super(true, false, true, x, y, "Resources/Buildings/" + imagePath);
		
	}
	
	
	
	
	
}
