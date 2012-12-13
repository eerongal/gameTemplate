package graphics;

import org.newdawn.slick.geom.Rectangle;

public class Camera{
	private float cameraStep;
	private Rectangle cameraView;
	private float viewWidth;
	private float viewHeight;
	
	public Camera(float viewWidth, float viewHeight, float cameraStep) {
		this.viewHeight = viewHeight;
		this.viewWidth = viewWidth;
		this.cameraStep = cameraStep;
	}
	
	public void init()
	{
		cameraView = new Rectangle(0,0,viewWidth, viewHeight);
	}
	
	public void stepX(int direct, int delta)
	{
		this.cameraView.setX(this.cameraView.getX() + (this.cameraStep * direct * delta));
	}
	
	public void stepY(int direct, int delta)
	{
		this.cameraView.setY(this.cameraView.getY() + (this.cameraStep * direct * delta));
	}
	
	public void moveTo(float x, float y)
	{
		this.cameraView.setX(x);
		this.cameraView.setY(y);
	}
	
	public Rectangle getView()
	{
		return this.cameraView;
	}
}
