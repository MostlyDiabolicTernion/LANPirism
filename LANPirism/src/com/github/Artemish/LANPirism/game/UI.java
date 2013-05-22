package com.github.Artemish.LANPirism.game;

import java.awt.Graphics;
import java.awt.Image;

public class UI {
	
	public Image lowerHUD;
	
	public Image upperHUD;
	
	public int lowerHeight;
	public int lowerWidth;
	public int upperHeight;
	public int upperWidth;
	
	public UI (String lowerHUDImagePath, String upperHUDImagePath) {
		/* lowerHUD = new Image("Resources/UI/" + lowerHUDImagePath);
		upperHUD = new Image("Resources/UI/" + upperHUDImagePath);
		lowerHeight = lowerHUD.getHeight();
		lowerWidth = lowerHUD.getWidth();
		upperHeight = upperHUD.getHeight();
		upperWidth = upperHUD.getWidth(); */
	}
	
	public void render (Graphics g) {
		/* g.drawImage(upperHUD, 0, 0);
		g.drawImage(lowerHUD, 0,600 - lowerHeight); */
	}
	
	
}
