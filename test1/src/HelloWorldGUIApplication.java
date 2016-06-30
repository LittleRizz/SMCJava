
//An application that closes using the WindowListener

import java.awt.event.*;
import java.awt.*;

public class HelloWorldGUIApplication extends Frame implements WindowListener {
  	
	public void paint(Graphics g){	
		g.setFont(new Font("Helvetica", Font.BOLD, 48));
    		g.drawString("Hello World!", 50, 200);
	}

  	public static void main(String[] args) {	
  		HelloWorldGUIApplication a = new HelloWorldGUIApplication();
		a.setSize(400, 400);	//Frame method
	   	a.setVisible(true);			//Frame method
		a.addWindowListener(a);
	}

	public void windowClosing(WindowEvent e) {	
		System.exit(0);
	}

	public void windowOpened(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
}
