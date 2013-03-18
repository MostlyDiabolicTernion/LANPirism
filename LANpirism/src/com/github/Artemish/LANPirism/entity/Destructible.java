package com.github.Artemish.LANPirism.entity;

import org.newdawn.slick.SlickException;

public class Destructible extends Entity {
	
	public int health;
	
	public Destructible(int health, float x, float y, String imagePath) throws SlickException {
		super(true, false, false, x, y, "Resources/Destructibles/" + imagePath);
		this.health = health;
	}
	
	
	
	
	
	
}
