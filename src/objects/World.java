package objects;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;

public class World {
	private Rectangle worldRect;
	private Image backdrop;
	
	public World(Rectangle worldRect)
	{
		this.worldRect = worldRect;
	}
	
	public void init(String background) throws SlickException
	{
		backdrop = new Image(background);
	}
	
	public Rectangle getBounds()
	{
		return this.worldRect;
	}
	
	public void setBounds(Rectangle newWorld)
	{
		this.worldRect = newWorld;
	}
	
	public void draw(float offsetX, float offsetY)
	{
		backdrop.draw(-1 * offsetX, -1 * offsetY);
	}
	
}
