package com.github.Artemish.LANPirism.entity;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Entity {
	
	public Entity(boolean hasHealth, boolean canMove, boolean hasOwner,
			float x, float y, String imagePath) {
		
		this.hasHealth = hasHealth;
		this.canMove = canMove;
		this.hasOwner = hasOwner;
		this.positionX = x;
		this.positionY = y;
		this.restImage = new Image(imagePath);
	}
	
	public Image restImage;
	
	public float positionX;
	
	public float positionY;
	
	public boolean hasHealth;
	
	public boolean canMove;
	
	public boolean hasOwner;
	
	public void render(Graphics g) {
		g.drawImage(restImage, positionX, positionY);
	}
	
}
