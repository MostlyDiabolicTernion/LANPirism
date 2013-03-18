package com.github.Artemish.LANPirism.entity;

public class Player {
	
	public double xWindow;
	public double yWindow;
	
	public int maxXWindow;
	public int maxYWindow;
	
	public int verticalScroll = 0;
	public int horizontalScroll = 0;
	
	public Player(int xWindow, int yWindow, int maxXWindow, int maxYWindow) {
		this.xWindow = xWindow;
		this.yWindow = yWindow;
		this.maxXWindow = maxXWindow;
		this.maxYWindow = maxYWindow;
	}
	
	public void updateWindow(int delta) {
		xWindow += delta * horizontalScroll;
    	yWindow += delta * verticalScroll;
    	if (xWindow < 0) xWindow = 0;
    	if (xWindow > maxXWindow) xWindow = maxXWindow - 0.01;
    	if (yWindow < 0) yWindow = 0;
    	if (yWindow > maxYWindow) yWindow = maxYWindow - 0.01;
	}
	
	
}