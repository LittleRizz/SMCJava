//Applet displays a string of text on standard-out
//(the Java console) and on the Applet panel

import java.applet.*;     					//for Applet class
import java.awt.*;						// for Graphics class

public class HelloWorldApplet extends Applet {

	public void init() {
		setBackground(Color.YELLOW);
		System.out.println("Hello World!");
	}

	public void paint(Graphics g) {
			g.setFont(new Font("Arial", Font.BOLD, 20));
			g.drawString("Hello World",40,60);
		}

}


