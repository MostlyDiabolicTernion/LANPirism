package com.github.MostlyDiabolicTernion.LANPirism.client;

import javax.swing.JFrame;

public final class LANPirismClient {
	public static void main(String[] args) {
		LANPirismClient client = new LANPirismClient();
		client.setVisible(true);
	}
	
	private final JFrame window;
	
	private void setVisible(boolean b) { window.setVisible(b); }
	private void set
	
	public LANPirismClient() {
		this("LANPirism");
	}
	
	public LANPirismClient(String windowTitle) {
		window = new JFrame(windowTitle) {
			private static final long serialVersionUID = 1L;
			
		};
	}
}
