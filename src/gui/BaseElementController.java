package gui;

import java.util.Properties;

import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.controls.Controller;
import de.lessvoid.nifty.elements.Element;
import de.lessvoid.nifty.input.NiftyInputEvent;
import de.lessvoid.nifty.screen.Screen;
import de.lessvoid.xml.xpp3.Attributes;

public class BaseElementController implements Controller {

	private Element element;
	
	public void bind(Nifty arg0, Screen arg1, Element arg2, Properties arg3,
			Attributes arg4) {
		this.element = element;
		
		
	}

	public void init(Properties arg0, Attributes arg1) {
		// TODO Auto-generated method stub
		
	}

	public boolean inputEvent(NiftyInputEvent arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public void onFocus(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStartScreen() {
		// TODO Auto-generated method stub
		
	}
	
	public void bam()
	{
		System.out.println("bam");
	}

}
