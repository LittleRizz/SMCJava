/*
MyBetterRectngl calculates its own area (inherited)
as well as draws a frame.
MyBetterRectngl is a subclass of rectngl (whose superclass is object.)
*/

package inheritance;

import java.awt.*;

 public class BetterRectangle extends Rectangle {
        int xPoint,yPoint;
        Color foregroundColor;
        public BetterRectangle(int x, int y, int w, int h, Color fg) {
                super(w, h);
                xPoint = x;     		//horizontal point - pixels from left top corner
               	yPoint = y;     		//vertical point - pixels from left top corner
               	foregroundColor = fg;
        }

        public void draw(Graphics g)  {
                g.setColor(foregroundColor);   //sets the foreground color
                g.drawRect(xPoint, yPoint, width, height);
        }
}

