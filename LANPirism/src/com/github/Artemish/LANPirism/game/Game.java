package com.github.Artemish.LANPirism.game;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.github.Artemish.LANPirism.entity.Player;
import com.github.Artemish.LANPirism.event.EventHub;
import com.github.Artemish.LANPirism.event.Trigger;
import com.github.Artemish.LANPirism.event.actions.SystemPrintAction;
import com.github.Artemish.LANPirism.event.actions.ZoomInAction;
import com.github.Artemish.LANPirism.event.actions.ZoomOutAction;
 
public class Game implements Runnable {
	
	public static final String NAME = "LANPirism";
	public static final int SCREEN_WIDTH = 1280;
	public static final int SCREEN_HEIGHT = 720;
	public static final int SCREEN_SCALE = 4;
	public static final int TICKS_PER_SEC = 60;
	
	private boolean running = false;
	
	public int gameTimeSeconds = 0;
	
	public GameApplet gameApplet;
	
	public GamePanel gameWindow;
	
	public Map gameMap;
	
	public UI gameUI;
	
	public Player controller;
	
    public Game() {
    	
    }
    
    public void start() {
    	running = true;
    }
    
    public void stop() {
    	running = false;
    }
    
    @Override
	public void run() {
		double nsPerTick = 1000000000.0 / 60.0;
		double unprocessedSteps = 0.0;
		long lastTime = System.nanoTime();
		long now;
		
		initialize();
		
		while (running) {
			now = System.nanoTime();
			unprocessedSteps += (lastTime - now) / nsPerTick;
			now = lastTime;
			
			if (unprocessedSteps >= 1) {
				tick();
				unprocessedSteps -= 1;
			}
			
			// Only update every 2 ms
			try { Thread.sleep(2);}
			catch (InterruptedException e) {e.printStackTrace();}
			
			gameWindow.repaint();
			
		}
	}
    
    public void registerWindow(GamePanel gameWindow) {
    	this.gameWindow = gameWindow;   	
    }
    
    public void initialize()  {
    	
    	try { gameMap = MapLoader.loadMap("Resources/map.txt"); }
    	catch (IOException e) { e.printStackTrace(); }
        
    	gameUI = new UI("LowerUI.png", "UpperUI.png");
    	
    	EventHub.addTrigger(new Trigger(1, new SystemPrintAction("Still works.")));
    	EventHub.addTrigger(new Trigger(2, new ZoomInAction(gameMap)));
    	EventHub.addTrigger(new Trigger(3, new ZoomOutAction(gameMap)));
    	
    }
    
    public void tick() {
    	controller.updateWindow(1);
    }
    
    public void render() {
    	
    	
    }
    
    public static void keyPressed(int key, char c) {}
    public static void keyReleased(int key, char c) {}
    
	
	public void initializeWindow() {
        JFrame frame = new JFrame("LANPirism!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel topGUI = new JLabel("Here's the top part of the GUI.");
        JLabel bottomGUI = new JLabel("Here's the bottom.");
        topGUI.setPreferredSize(new Dimension(800, 40));
        bottomGUI.setPreferredSize(new Dimension(800, 40));
        frame.getContentPane().add(topGUI, BorderLayout.PAGE_START);
        frame.getContentPane().add(bottomGUI, BorderLayout.PAGE_END);
        
        gameWindow = new GamePanel();
        gameWindow.setPreferredSize(new Dimension(800, 600));
        
        frame.getContentPane().add(gameWindow, BorderLayout.CENTER);
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
        
	}
    
    public static void main(String[] args) {
    	final Game game = new Game();
    	javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                game.initializeWindow();
            }
        });
    	
    	game.start();
    	game.run();
    }
    
    
}