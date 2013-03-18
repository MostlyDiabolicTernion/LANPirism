package com.github.Aretmish.LANPirism.game;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class MapLoader {
	public static Map loadMap(String mapPath) throws IOException {
		Scanner mapReader = new Scanner(new File(mapPath));
		int width = mapReader.nextInt();
		int height = mapReader.nextInt();
		int[][] tiles = new int[width][height];
		
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				tiles[x][y] = mapReader.nextInt();
			}
		}
		
		mapReader.close();
		
		return new Map(width, height, 64, tiles);
	}
}
