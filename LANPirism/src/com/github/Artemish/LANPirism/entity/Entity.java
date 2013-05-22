package com.github.Artemish.LANPirism.entity;

import java.awt.Graphics;
import java.awt.Image;

public class Entity {
	
	/**
	 * Entity Superclass
	 * 
	 * @param hasHealth
	 * @param canMove
	 * @param hasOwner
	 * @param x
	 * @param y
	 * @param imagePath
	 */
	
	public Entity(boolean hasHealth, boolean canMove, boolean hasOwner,
			float x, float y, String imagePath) {
		
		this.hasHealth = hasHealth;
		this.canMove = canMove;
		this.hasOwner = hasOwner;
		this.positionX = x;
		this.positionY = y;
		
	}
	
	public Image restImage;
	
	public float positionX;
	
	public float positionY;
	
	public boolean hasHealth;
	
	public boolean canMove;
	
	public boolean hasOwner;
	
	/**
	 * Renders this entity, given the controlling player's X and Y window coordinates.
	 * 
	 * @param g
	 * @param xWindow
	 * @param yWindow
	 */
	
	public void render(Graphics g, Player p, int scale) {
		// if () ;
		
		// g.drawImage(restImage, positionX, positionY);
	}
	
}
