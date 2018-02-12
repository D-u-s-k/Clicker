package dusk.programs.clicker.control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControlHandler implements KeyListener, MouseListener {

	public static enum Mode {
		MainMenu, Playing
	}
	
	public static Mode mode = Mode.MainMenu;
	
	public static void startPlaying() {
		//reset()
		mode = Mode.Playing;
	}
	
	//Mouse
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		switch (mode) {
		case MainMenu:
			doMenuMouseClicked(e);
			break;
		case Playing:
			break;
		}
	}
	
	public static void doMenuMouseClicked(MouseEvent e) {
		System.out.println("Mouse control functional.");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	//Keyboard
	
	@Override
	public void keyPressed(KeyEvent e) {
		switch (mode) {
		case MainMenu:
			doMenuKeyPressed(e);
			break;
		case Playing:
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
	
	public static void doMenuKeyPressed(KeyEvent e) {
		System.out.println("Keyboard control functional");
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

}
