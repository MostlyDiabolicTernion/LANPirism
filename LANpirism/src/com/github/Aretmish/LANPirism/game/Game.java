package com.github.Aretmish.LANPirism.game;

import java.io.IOException;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.KeyListener;
import org.newdawn.slick.SlickException;

import com.github.Artemish.LANPirism.entity.Player;
 
public class Game extends BasicGame implements KeyListener {
	
	public Map gameMap;
	
	public UI gameUI;
	
	public Player controller;
	
    public Game() throws SlickException {
        super("Engine Demonstration");
    }
    
    @Override
    public void init(GameContainer gc) throws SlickException {
    	try { gameMap = MapLoader.loadMap("Resources/map.txt"); }
    		catch (IOException e) { e.printStackTrace(); }
        
    	controller = new Player(0,0, gameMap.scale * gameMap.tiles.length - 800,
        		gameMap.scale * gameMap.tiles[0].length - 600);
        
    	gameUI = new UI("LowerUI.png", "UpperUI.png");
    }
 
    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
    	controller.updateWindow(delta);
    }
 
    public void render(GameContainer gc, Graphics g) throws SlickException {
    	gameMap.render(g, controller.xWindow, controller.yWindow);
    	gameUI.render(g);
    }
    
    public static void main(String[] args) throws SlickException {
         AppGameContainer app = new AppGameContainer(new Game());
         app.setDisplayMode(800, 600, false);
         app.start();
         System.out.println("LOL it works..!");
    }
    
    @Override
    public void keyPressed(int key, char c) {
        if (key == Input.KEY_ENTER) {
            System.out.println("Enter key hit.");
        } else if (key == Input.KEY_LEFT) {
            controller.horizontalScroll -= 1;
        } else if (key == Input.KEY_RIGHT) {
        	controller.horizontalScroll += 1;
        } else if (key == Input.KEY_UP) {
        	controller.verticalScroll -= 1;
        } else if (key == Input.KEY_DOWN) {
        	controller.verticalScroll += 1;
        } else if (key == Input.KEY_ESCAPE) {
        	
        }
    }
    
    public void keyReleased(int key, char c) {
    	if (key == Input.KEY_LEFT) {
    		controller.horizontalScroll += 1;
    	} else if (key == Input.KEY_RIGHT) {
    		controller.horizontalScroll -= 1;
    	} else if (key == Input.KEY_UP) {
    		controller.verticalScroll += 1;
    	} else if (key == Input.KEY_DOWN) {
        	controller.verticalScroll -= 1;
        }    	
    }
    
    
}