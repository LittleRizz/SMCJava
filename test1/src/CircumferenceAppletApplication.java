//calculates circumference and displays result on console
import java.applet.*;
import java.awt.*;

public class CircumferenceAppletApplication extends Applet{

	double result;

	public void init() {
		setBackground(Color.ORANGE);
		int i = 2, r = 4;
		double x = 3.14;
		result = i * x * r;
		System.out.println("Circumference:  " + result);
	}

	public static void main(String[] args) {
		int i = 2, r = 4;
		double x = 3.14;
		double result = i * x * r;

		System.out.println("Circumference:  " + result);
	}

	public void paint(Graphics g) {
		g.setFont(new Font("Arial", Font.BOLD, 17));
		g.drawString("Circumference:  " + result,10,50);
	}

}

