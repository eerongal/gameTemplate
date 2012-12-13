package main.java.com.eero.app;

import graphics.Camera;
import graphics.Renderer;
import graphics.Sprite;
import gui.Gui;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import objects.GameObject;
import objects.Npc;
import objects.World;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.InputListener;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;

import sound.SoundPlayer;
import de.lessvoid.nifty.slick2d.input.PlainSlickInputSystem;
import de.lessvoid.nifty.slick2d.input.SlickInputSystem;

public class App extends BasicGame {

	
	public App() {
		super("Game Template");
	}

	@Override
	public void init(GameContainer gc) throws SlickException {
		
	}

	@Override
	public void update(GameContainer gc, int delta) throws SlickException {

	}

	public void render(GameContainer gc, Graphics g) throws SlickException {

		
	}

	public static void main(String[] args) throws SlickException {

		AppGameContainer app = new AppGameContainer(new App());
		
		app.start();
		
		
	}

}
