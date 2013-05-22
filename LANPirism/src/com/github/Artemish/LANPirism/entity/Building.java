package com.github.Artemish.LANPirism.entity;

public class Building extends Entity {

	public Building(boolean hasHealth, boolean canMove, boolean hasOwner,
			float x, float y, String imagePath) {
		super(true, false, true, x, y, "Resources/Buildings/" + imagePath);
		
	}
	
	
	
	
	
}
