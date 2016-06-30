/*
An Applet - BetterRectangleDriver and an object BetterRectangle.
The applet instantiates a BetterRectangle.
BetterRectngl calculates its own area (inherited)
as well as draws a frame.
BetterRectngl is a subclass of Rectangle (whose superclass is Object.)
The applet displays the areaon the Applet
and draws a frame.
*/
package inheritance;
import java.applet.*;
import java.awt.*;

public class BetterRectangleDriver extends Applet {
        BetterRectangle  br;

        public void init() {
                setBackground(Color.YELLOW);
                br = new BetterRectangle(25,40,50,70,Color.RED);
        }

        public void paint(Graphics g)  {
			    g.setFont(new Font("Arial", Font.BOLD, 20));
                g.drawString("area:  " + br.calcArea(), 80, 40);
                br.draw(g);
        }
}



