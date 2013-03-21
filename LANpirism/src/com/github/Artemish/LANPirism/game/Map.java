package com.github.Artemish.LANPirism.game;

import java.util.HashMap;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

import com.github.Artemish.LANPirism.entity.Entity;

public class Map {
	
	public int width;
	public int height;
	
	public int scale;
	
	public HashMap<Entity, Integer> entityMap = new HashMap<Entity, Integer>();
	
	public int latestID;
	
	public int[][] tiles;
	
	public Color[] tileColors = {Color.black,Color.red,Color.blue};
	
	public Map(int width, int height, int scale, int[][] tiles) {
		this.width = width;
		this.height = height;
		this.tiles = tiles;
		this.scale = scale;
	}
	
	public void addEntity() {
		
	}
	
	public void render(Graphics g, double xWindow, double yWindow) {
    	
    	for (double x = - (xWindow % scale); x < 800; x += scale) {
    		for (double y = - (yWindow % scale); y < 600; y += scale) {
        		int xTile = (int) Math.floor((x + xWindow) / scale);
        		int yTile = (int) Math.floor((y + yWindow) / scale);
    			g.setColor(tileColors[tiles[xTile][yTile]]);
    			int xLocation = (int) Math.floor(x);
    			int yLocation = (int) Math.floor(y);
    			g.fillRect(xLocation, yLocation, scale, scale);
        	}
    	}
		
	}
	
}
