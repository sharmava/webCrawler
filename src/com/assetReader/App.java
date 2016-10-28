package com.assetReader;

public class App {

	public static void main(String[] args) {
		
		String root = "http://www.sears.com";		
		BFS bfs = new BFS();	
		bfs.discoverWeb(root);
		
	}
}
