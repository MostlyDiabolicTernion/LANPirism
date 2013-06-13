package com.github.Artemish.LANPirism.game;

import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GamePanel extends JPanel {
	
	public Game game;
	
	public int pixels;
	
	public GamePanel() {
		super();
		pixels = 0;
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.drawRect(10,10, pixels, pixels);
		pixels++;
		
		
	}
	
}
