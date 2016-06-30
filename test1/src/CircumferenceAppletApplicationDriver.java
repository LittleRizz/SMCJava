//calculates circumference and displays result on console
import java.applet.*;
import java.awt.*;

public class CircumferenceAppletApplicationDriver extends Applet{

	public void init() {
		setBackground(Color.ORANGE);
		System.out.println("Circumference:  " + Calculator.calcCircumference());
	}

	public static void main(String[] args) {
		System.out.println("Circumference:  " + Calculator.calcCircumference());
	}

	public void paint(Graphics g) {
		g.setFont(new Font("Arial", Font.BOLD, 17));
		g.drawString("Circumference:  " + Calculator.calcCircumference(),10,50);
	}

}

