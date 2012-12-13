package objects;

import input.Parameter;
import graphics.Sprite;

import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Shape;

public abstract class GameObject {
	protected final Sprite sprite;
	
	public GameObject(Sprite sprite)
	{
		this.sprite = sprite;
	}
	
	public Image getSprite()
	{
		return this.sprite.getSprite();
	}
	
	public void moveTo(float X, float Y)
	{
		this.sprite.moveTo(X, Y);
	}
	
	public void moveX(float X)
	{
		this.sprite.moveX(X);
	}
	
	public void moveY(float Y)
	{
		this.sprite.moveY(Y);
	}
	
	public void incrementX(float increment)
	{
		this.sprite.incrementX(increment);
	}
	
	public void incrementY(float increment)
	{
		this.sprite.incrementY(increment);
	}
	
	public boolean checkCollision(Shape rect)
	{
		return rect.intersects(this.sprite.getShape());
	}
	
	public Shape getShape()
	{
		return this.sprite.getShape();
	}
	
	public void animate()
	{
		this.sprite.animate();
	}
	
	public void stopAnimate(boolean restart)
	{
		this.sprite.stopAnimate(restart);
	}
	
	public void updateAnim(int delta)
	{
		this.sprite.updateAnim(delta);
	}
	
	public void vertAnimate(int vertY, boolean reset)
	{
		this.sprite.spriteVertMove(vertY, reset);
	}
	
	public abstract void update(Parameter params);
}