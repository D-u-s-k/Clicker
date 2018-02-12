package dusk.programs.clicker.graphics;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;


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
				System.out.println("exiting");
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
		//switch (ControlHandler.mode) {
		frame.getGraphics().drawImage(backbuffer, 0, 0, frame.getWidth(), frame.getHeight(), frame);
	}

}
