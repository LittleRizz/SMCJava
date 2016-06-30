/*
MonthsSwitch
This Applet uses the 'switch' statement to display the month name
- For now the "input" is "hard-wired" in the a variable
*/
package flowSolutions;

import java.applet.*;
import java.awt.*;

public class MonthsSwitch extends Applet {

	int whichMonth;   // hard-wired

	public void init() {
		this.setBackground(Color.PINK);
		whichMonth  =  7;   // hard-wired
	}


	public void paint(Graphics g)  {
		g.drawString("month is: " + getMonth(whichMonth) ,10,50);

	}

	String getMonth(int myWhichMonth)  {
		switch (myWhichMonth) {
 			case 1:   return "January";
 			case 2:   return "February";
 			case 3:   return "March";
 			case 4:   return "April";
 			case 5:   return "May";
 			case 6:   return "June";
 			case 7:   return "July";
 			case 8:   return "August";
 			case 9:   return "September";
 			case 10:  return "October";
 			case 11:  return "November";
 			case 12:  return "December";
 			default:  return "Wrong!  "+ myWhichMonth;
		}
	}
}



