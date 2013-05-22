package com.github.Artemish.LANPirism.game;

import java.awt.Graphics;
import java.io.IOException;

import com.github.Artemish.LANPirism.entity.Player;
import com.github.Artemish.LANPirism.event.EventHub;
import com.github.Artemish.LANPirism.event.Trigger;
import com.github.Artemish.LANPirism.event.actions.SystemPrintAction;
import com.github.Artemish.LANPirism.event.actions.ZoomInAction;
import com.github.Artemish.LANPirism.event.actions.ZoomOutAction;

/*
 * TODO Relocate code that manages interfaces to the game (this is pretty much all of it at the moment)
 *      Game should represent a game (interaction between two players), no more
 */
 
public class Game  {
	
	public Map gameMap;
	
	public UI gameUI;
	
	public Player controller;
	
    public Game() {
    	
    }
    
    public void init()  {
    	try { gameMap = MapLoader.loadMap("Resources/map.txt"); }
    		catch (IOException e) { e.printStackTrace(); }
        
    	controller = new Player(0,0, gameMap.scale * gameMap.tiles.length - 1200,
        		gameMap.scale * gameMap.tiles[0].length - 700);
        
    	gameUI = new UI("LowerUI.png", "UpperUI.png");
    	
    	EventHub.addTrigger(new Trigger(1, new SystemPrintAction("Still works.")));
    	EventHub.addTrigger(new Trigger(2, new ZoomInAction(gameMap)));
    	EventHub.addTrigger(new Trigger(3, new ZoomOutAction(gameMap)));
    	// gameMap.addEntity(new Footman(10,10));
    }
    
    public void update() {
    	controller.updateWindow(1);
    }
 
    public void render(Graphics g) {
    	gameMap.render(g, controller);
    	gameUI.render(g);
    }
    
    public static void main(String[] args)  {
         // 1200x700
    }
    
    public void keyPressed(int key, char c) {
        /* if (key == Input.KEY_ENTER) {
            EventHub.process(new EnterKeyEvent());
        } else if (key == Input.KEY_O) {
        	EventHub.process(new OKeyEvent());
        } else if (key == Input.KEY_P) {
        	EventHub.process(new PKeyEvent());
        } else if (key == Input.KEY_LEFT) {
            controller.horizontalScroll -= 1;
        } else if (key == Input.KEY_RIGHT) {
        	controller.horizontalScroll += 1;
        } else if (key == Input.KEY_UP) {
        	controller.verticalScroll -= 1;
        } else if (key == Input.KEY_DOWN) {
        	controller.verticalScroll += 1;
        } else if (key == Input.KEY_ESCAPE) {
        	
        } */
    }
    
    public void keyReleased(int key, char c) {
    	/* if (key == Input.KEY_LEFT) {
    		controller.horizontalScroll += 1;
    	} else if (key == Input.KEY_RIGHT) {
    		controller.horizontalScroll -= 1;
    	} else if (key == Input.KEY_UP) {
    		controller.verticalScroll += 1;
    	} else if (key == Input.KEY_DOWN) {
        	controller.verticalScroll -= 1;
        } */ 	
    }
    
    
}