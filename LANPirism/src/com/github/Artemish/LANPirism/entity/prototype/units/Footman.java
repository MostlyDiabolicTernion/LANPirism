package com.github.Artemish.LANPirism.entity.prototype.units;

import org.newdawn.slick.SlickException;

import com.github.Artemish.LANPirism.entity.Unit;

public class Footman extends Unit {
	
	public Footman(int q, int y) throws SlickException {
		super(100, 100, q, y, "footman.jpg");
	}
}