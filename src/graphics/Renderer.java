package graphics;

import java.util.Map;

import objects.GameObject;
import objects.World;

import org.lwjgl.LWJGLException;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

public class Renderer {
	private int viewWidth;
	private int viewHeight;
	private int displayMode;

	private final AppGameContainer app;
	//private final Graphics graphics;

	private Rectangle viewportRect;

	public Renderer(int viewWidth, int viewHeight, AppGameContainer app) {
		this.viewWidth = viewWidth;
		this.viewHeight = viewHeight;
		this.app = app;
		this.displayMode = 0;
		//this.graphics = graphics;
	}

	public void init() throws SlickException, LWJGLException {
		app.setDisplayMode(this.viewWidth, this.viewHeight, false);
		viewportRect = new Rectangle(0, 0, viewWidth, viewHeight);
		
		
	}

	public void setDisplayMode(int mode)
	{
		this.displayMode = mode;
	}
	
	public void resize(int newWidth, int newHeight) throws SlickException {
		this.viewWidth = newWidth;
		this.viewHeight = newHeight;
		app.setDisplayMode(this.viewWidth, this.viewHeight, false);
		viewportRect.setWidth(this.viewWidth);
		viewportRect.setHeight(this.viewHeight);
	}

	public void render(Map<String, GameObject> objectMap, Rectangle camera,
			World world, Image title)
	{
		switch(this.displayMode)
		{
		case 0:
			this.renderTitle(objectMap, title);
			break;
		case 1:
			this.renderGame(objectMap, camera, world);
			break;
		}
	}
	
	private void renderTitle(Map<String, GameObject> objectMap, Image title)
	{
		
	}
	
	private void renderGame(Map<String, GameObject> objectMap, Rectangle camera,
			World world) {
		float offsetX;
		float offsetY;
		float drawX;
		float drawY;
		Shape drawRect;
		
		offsetX = camera.getX();
		offsetY = camera.getY();

		world.draw(offsetX, offsetY);
		
		for (GameObject obj : objectMap.values()) {
			if (camera.intersects(obj.getShape())) {
				drawRect = obj.getShape();
				drawX = drawRect.getX() - offsetX;
				drawY = drawRect.getY() - offsetY;
				
				obj.getSprite().draw(drawX, drawY, drawRect.getWidth(), drawRect.getHeight());
			}
		}
	}

}
