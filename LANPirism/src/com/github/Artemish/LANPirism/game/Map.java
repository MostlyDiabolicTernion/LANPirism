package com.github.Artemish.LANPirism.game;

import java.util.ArrayList;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

import com.github.Artemish.LANPirism.entity.Entity;
import com.github.Artemish.LANPirism.entity.Player;

public class Map {
	
	public int width;
	public int height;
	
	public int scale;
	
	public ArrayList<Entity> entityList = new ArrayList<Entity>();
	
	public int latestID;
	
	public int[][] tiles;
	
	public Color[] tileColors = {Color.black,Color.white,Color.blue};
	
	public Map(int width, int height, int scale, int[][] tiles) {
		this.width = width;
		this.height = height;
		this.tiles = tiles;
		this.scale = scale;
	}
	
	public void addEntity(Entity entity) {
		entityList.add(entity);
	}
	
	public void render(Graphics g, Player p) {
    	int xTile, yTile;
		
    	for (int x = - (p.xWindow % scale); x < 1200; x += scale) {
    		xTile = (int) Math.floor((x + p.xWindow) / scale);
    		for (int y = - (p.yWindow % scale); y < 700; y += scale) {
    			yTile = (int) Math.floor((y + p.yWindow) / scale);
    			g.setColor(tileColors[tiles[xTile][yTile]]);
    			g.fillRect(x, y, scale, scale);
        	}
    	}
    	
    	for (Entity e : entityList) {
    		e.render(g, p, scale);
    	}
		
	}
	
}
