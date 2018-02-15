package dusk.programs.clicker.src;

import dusk.programs.clicker.control.ControlHandler;
import dusk.programs.clicker.filemanip.TextureHandler;
import dusk.programs.clicker.graphics.GraphicsHandler;
import dusk.programs.clicker.graphics.TextureLoader;

public class Main implements Runnable {
	
	public static Thread thread;
	public static Main m;
	
	public static void main(String[] args) {
		m = new Main();
	}
	
	public Main() {
		TextureHandler.init();
		TextureLoader.init();
		GraphicsHandler.init();
		GraphicsHandler.frame.addKeyListener(new ControlHandler());
		GraphicsHandler.frame.addMouseListener(new ControlHandler());
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
