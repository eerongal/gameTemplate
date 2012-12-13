package gui;

import org.newdawn.slick.GameContainer;

import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.NiftyMethodInvoker;
import de.lessvoid.nifty.elements.Element;
import de.lessvoid.nifty.screen.Screen;
import de.lessvoid.nifty.screen.ScreenController;

public class BaseScreenController implements ScreenController{

	  private Nifty nifty;
	  private Screen screen;
	  private GameContainer app;
	  
	  
	public void bind(Nifty arg0, Screen arg1) {
	    this.nifty = nifty;
	    this.screen = screen;
	    
	    System.out.println("******INITIALIZED SCREEN: " + screen);
		
	}

	public void onEndScreen() {
		// TODO Auto-generated method stub
		
	}

	public void onStartScreen() {
//		Element niftyElement = this.screen.findElementByName("button2");
		//niftyElement.getElementInteraction().getPrimary().setOnClickMethod(new NiftyMethodInvoker(nifty,"test()", this));
		
	}
	
	public String getPlayerName()
	{
		return "hiya!";
	}
	

}
