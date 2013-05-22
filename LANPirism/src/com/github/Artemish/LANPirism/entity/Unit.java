package com.github.Artemish.LANPirism.entity;

public class Unit extends Entity {
	
	public int health;
	
	public double moveSpeed; 
	
	/**
	 * A standard Unit entity. Has health, movespeed, an o
	 * 
	 * @param health
	 * @param moveSpeed
	 * @param xPosition
	 * @param yPosition
	 * @param imagePath
	 */
	
	public Unit(int health, double moveSpeed, float x, float y, String imagePath) {
		super(true, true, true, x, y, "Resources/Units/" + imagePath);
		this.health = health;
		this.moveSpeed = moveSpeed;
	}
	
	
}
