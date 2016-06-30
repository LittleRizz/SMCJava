//this Applet uses StringBuffer & for loop
package flowSolutions;
import java.applet.*;
import java.awt.*;

public class DisplayNumbers extends Applet {

	StringBuilder strBuild = new StringBuilder() ;

	public void init() {
		this.setBackground(Color.MAGENTA);
		for (int i = 1;  i < 11;  i++) {
			System.out.println(i);
			strBuild.append(" " + i);
		}
		for (int i = 10;  i > 0;  i--) {
			System.out.println(i);
			strBuild.append(" " + i);
		}
	}


	public static void main(String [ ] args) {

		StringBuilder strBuild = new StringBuilder() ;
		for (int i = 1;  i < 11;  i++) {
			System.out.println(i);
			strBuild.append(" " + i);
		}
		for (int i = 10;  i > 0;  i--) {
			System.out.println(i);
			strBuild.append(" " + i);
		}
		System.out.println(strBuild);
	}
	public void paint(Graphics g)  {
		g.drawString(strBuild.toString(),10,50);
	}
}


