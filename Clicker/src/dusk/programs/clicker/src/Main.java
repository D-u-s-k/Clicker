package dusk.programs.clicker.src;

import dusk.programs.clicker.graphics.GraphicsHandler;

public class Main implements Runnable {
	
	public static Thread thread;
	public static Main m;
	
	public static void main(String[] args) {
		m = new Main();
	}
	
	public Main() {
		//TextureHandler.init();
		//TileHandler.init();
		GraphicsHandler.init();
		//GraphicsHandler.frame.addKeyListener(new ControlHandler());
		//MusicHandler.musicTester();
		start();
	}
	
	public void start() {
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		while (true) {
			GraphicsHandler.graphicsUpdate();
		}
	}

}
