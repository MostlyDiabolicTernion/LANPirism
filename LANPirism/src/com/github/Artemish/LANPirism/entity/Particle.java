package com.github.Artemish.LANPirism.entity;

import org.newdawn.slick.SlickException;

public class Particle extends Entity {
	
	public Particle(float x, float y, String imagePath) throws SlickException {
		super(false, false, false, x, y, "Resources/Particles/" + imagePath);
	}
	
	
}
