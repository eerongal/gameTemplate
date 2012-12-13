package graphics;

import java.io.IOException;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.geom.Shape;

public class Sprite {
	protected SpriteSheet texture;
	protected final String path;
	protected final Shape rect;
	protected final String imgType;
	private int currStep;
	private int vertStep;
	private final int spriteWidth;
	private final int spriteHeight;
	private Animation animation;
	
	public Sprite(String path, Shape rect, String imgType, int spriteWidth, int spriteHeight)
	{
		this.path = path;
		this.rect = rect;
		this.imgType = imgType;
		this.spriteHeight = spriteHeight;
		this.spriteWidth = spriteWidth;
		currStep = 0;
		vertStep = 0;
		
		
	}
	
	public void init() throws IOException, SlickException {
		texture = new SpriteSheet(this.path, spriteWidth, spriteHeight);
		animation = new Animation();
		animation.setLooping(true);
		for(int i =0; i< this.texture.getHorizontalCount(); i++)
		{
			animation.addFrame(texture.getSprite(i, vertStep), 150);
		}
	}
	
	
	public void spriteVertMove(int vertY, boolean reset)
	{
		if(vertY < this.texture.getVerticalCount())
		{
			this.vertStep = vertY;
			
		}
		
		if(reset)
		{
			this.currStep = 0;
		}
		
		System.out.println("Vert step:" + this.vertStep);
		
		animation = new Animation();
		animation.setLooping(true);
		for(int i =0; i<this.texture.getHorizontalCount(); i++)
		{
			animation.addFrame(texture.getSprite(i, vertStep), 150);
		}
	}
	
	public void updateAnim(int delta)
	{
		animation.update(delta);
	}
	
	public void moveTo(float X, float Y)
	{
		this.rect.setX(X);
		this.rect.setY(Y);
	}
	
	public void moveX(float X)
	{
		this.rect.setX(X);
	}
	
	public void moveY(float Y)
	{
		this.rect.setY(Y);
	}
	
	public void incrementX(float increment)
	{
		this.rect.setX(this.rect.getX()+increment);
	}
	
	public void incrementY(float increment)
	{
		this.rect.setY(this.rect.getY()+increment);
	}
	
	public void animate()
	{
		animation.start();
	}
	
	public void stopAnimate(boolean reset)
	{
		animation.stop();
		if(reset)
		{
			animation.setCurrentFrame(0);
		}
	}
	
	public Image getSprite()
	{
		return animation.getCurrentFrame();
	}
	public Shape getShape()
	{
		return this.rect;
	}
}
