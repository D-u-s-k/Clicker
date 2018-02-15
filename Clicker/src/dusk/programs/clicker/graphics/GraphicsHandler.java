package dusk.programs.clicker.graphics;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

import dusk.programs.clicker.control.ControlHandler;


public class GraphicsHandler {
	
	public static JFrame frame;
	public static Graphics2D g2d;
	public static BufferedImage backbuffer;
	
	public static void init() {
		backbuffer = new BufferedImage(1920, 1080, BufferedImage.TYPE_INT_RGB);
		g2d = backbuffer.createGraphics();
		frame = new JFrame("Clicker");
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				System.out.println("Exiting.");
				System.exit(0);
			}
		});
		frame.setSize(960, 540);
		frame.setLocation(480, 270);
		frame.setVisible(true);
	}
	
	public static void graphicsUpdate() {
		g2d.setColor(Color.BLACK);
		g2d.fillRect(0, 0, 1920, 1080);
		g2d.setColor(Color.WHITE);
		//g2d.drawImage(TextureHandler.getTexture("Test"), 100, 100, 100 + 100, 100 + 100, 0, 0, 32, 32, frame);
		switch (ControlHandler.mode) {
		case MainMenu:
			doMenuGraphics();
		case Playing:
			doPlayingGraphics();
		}
		frame.getGraphics().drawImage(backbuffer, 0, 0, frame.getWidth(), frame.getHeight(), frame);
	}
	
	public static void doMenuGraphics() {
		g2d.drawString("Clicker game. Press enter to enter game.", 10, 80);
		g2d.drawString("To load save data, press L", 10, 100);
	}
	
	public static void doPlayingGraphics() {
		
	}
	

}
