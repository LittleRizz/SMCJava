/*
MonthsArray - This Applet sets up an array of the month names and displays the "selected month"
- for now the "input" is "hard-wired" in the a variable
*/
package flowSolutions;
import java.applet.*;
import java.awt.*;

public class MonthsArray extends Applet {

	int whichMonth = 5;  //Hard wired here

	String[ ] monthsArray  ={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

	public void init() {
		this.setBackground(Color.CYAN);
	}

	public void paint(Graphics g)  {
		g.drawString("My birthday is in " + monthsArray[whichMonth - 1] + ".",10,50);
	}
}



