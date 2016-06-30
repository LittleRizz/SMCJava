/*
MonthsLayeredArray - This Applet sets up a layered array of the month names and 'position in year' (eg. "Jan"  "first")
and displays the selected month and its position in the year
- for now the "input integer" is "hard-wired" in the a variable
*/
package flowSolutions;

import java.applet.*;
import java.awt.*;

public class MonthsMultiDimensionalArray extends Applet {

	 static int whichMonth= 7;  //Hard-wired here

	 static String[ ][ ] monthsArray  ={{"January","31"},{"February","28"},{"March","30"},{"April","31"},
			{"May","31"},{"June","30"},{"July","31"},{"August","31"},{"September","30"},
			{"October","31"},{"November","30"},{"December","31"}};

	public static void main(String[] args) {

			System.out.println(monthsArray[whichMonth - 1][0] + "  has "
  							+ monthsArray[whichMonth - 1][1] + " days.");

		}


	public void init() {
		this.setBackground(Color.CYAN);
	}

	public void paint(Graphics g)  {
		g.drawString(monthsArray[whichMonth - 1][0] + "  has "
  							+ monthsArray[whichMonth - 1][1] + " days.",10,50);
	}
}



