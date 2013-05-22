package com.github.Artemish.LANPirism.entity;


public class Destructible extends Entity {
	
	public int health;
	
	public Destructible(int health, float x, float y, String imagePath) {
		super(true, false, false, x, y, "Resources/Destructibles/" + imagePath);
		this.health = health;
	}
	
	
	
	
	
	
}
