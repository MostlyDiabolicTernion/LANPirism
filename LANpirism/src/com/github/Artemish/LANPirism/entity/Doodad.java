package com.github.Artemish.LANPirism.entity;

import org.newdawn.slick.SlickException;

public class Doodad extends Entity {
	
	public Doodad(float x, float y, String imagePath) throws SlickException {
		super(false, false, false, x, y, "Resources/Doodads/" + imagePath);
	}
	
	
	
	
}
