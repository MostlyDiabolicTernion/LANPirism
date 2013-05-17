package com.github.Artemish.LANPirism.game;

import java.io.IOException;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.KeyListener;
import org.newdawn.slick.SlickException;

import com.github.Artemish.LANPirism.entity.Player;
import com.github.Artemish.LANPirism.entity.prototype.units.Footman;
import com.github.Artemish.LANPirism.event.EventHub;
import com.github.Artemish.LANPirism.event.Trigger;
import com.github.Artemish.LANPirism.event.actions.SystemPrintAction;
import com.github.Artemish.LANPirism.event.actions.ZoomInAction;
import com.github.Artemish.LANPirism.event.actions.ZoomOutAction;
import com.github.Artemish.LANPirism.event.events.EnterKeyEvent;
import com.github.Artemish.LANPirism.event.events.OKeyEvent;
import com.github.Artemish.LANPirism.event.events.PKeyEvent;
 
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
        
    	controller = new Player(0,0, gameMap.scale * gameMap.tiles.length - 1200,
        		gameMap.scale * gameMap.tiles[0].length - 700);
        
    	gameUI = new UI("LowerUI.png", "UpperUI.png");
    	
    	EventHub.addTrigger(new Trigger(1, new SystemPrintAction("Still works.")));
    	EventHub.addTrigger(new Trigger(2, new ZoomInAction(gameMap)));
    	EventHub.addTrigger(new Trigger(3, new ZoomOutAction(gameMap)));
    	// gameMap.addEntity(new Footman(10,10));
    }
 
    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
    	controller.updateWindow(delta);
    }
 
    public void render(GameContainer gc, Graphics g) throws SlickException {
    	gameMap.render(g, controller);
    	gameUI.render(g);
    }
    
    public static void main(String[] args) throws SlickException {
         AppGameContainer app = new AppGameContainer(new Game());
         app.setDisplayMode(1200, 700, false);
         app.start();
         System.out.println("Lol, it works!");
    }
    
    @Override
    public void keyPressed(int key, char c) {
        if (key == Input.KEY_ENTER) {
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