import java.util.ArrayList;

import animations.ApplicationWindow;
import animations.AnimationWindow;
import animations.AnimationEventListener;

public class Game {
	
	private static GameBall ball;
	private static ArrayList<GameTakoz> takozlar;
	
	public static void main(String[] args) {
	    ApplicationWindow frame = new ApplicationWindow();
	    
	    // the following code realizes the top level application window
	    frame.pack();
	    frame.setVisible(true);
	  }
}