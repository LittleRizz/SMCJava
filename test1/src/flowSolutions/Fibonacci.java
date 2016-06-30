//An Applet displaying 12 Fibonacci numbers starting from 2
package flowSolutions;
import java.applet.*;
import java.awt.*;

public class Fibonacci extends Applet {

	StringBuffer strBuf = new StringBuffer() ;

	public void init() {
		this.setBackground(Color.MAGENTA);
		int current, prev = 1, prevprev = 0;

		for(int i = 0; i < 12; i++) {
			current = prev + prevprev;
			System.out.print(current + " ");
			prevprev = prev;
			prev = current;
			strBuf.append(" " +current);
   		}
	}

	public void paint(Graphics g)  {
		g.drawString(strBuf.toString(),10,50);

	}
}


