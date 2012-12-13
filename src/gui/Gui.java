package gui;

import org.newdawn.slick.GameContainer;

import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.nulldevice.NullSoundDevice;
import de.lessvoid.nifty.slick2d.input.PlainSlickInputSystem;
import de.lessvoid.nifty.slick2d.render.SlickRenderDevice;
import de.lessvoid.nifty.tools.TimeProvider;

public class Gui{
	
	private Nifty nifty;
	private PlainSlickInputSystem inputSystem;
	
	public void init(GameContainer gc, PlainSlickInputSystem inputSystem, String xmlfile, String start)
	{
		this.inputSystem = inputSystem;
		nifty = new Nifty(new SlickRenderDevice(gc), new NullSoundDevice(), inputSystem, new TimeProvider());
		nifty.fromXml(xmlfile, start);
		
	}
	
	public void update(GameContainer gc, int delta)
	{
		nifty.update();
	}
	
	public void render()
	{
		nifty.render(false);
	}
	
}
