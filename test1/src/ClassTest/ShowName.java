package ClassTest;

import javax.swing.JOptionPane;

public class ShowName {

	public static void main (String [] args){
		String xName = JOptionPane.showInputDialog("What is your name?");
		String scoreStr = JOptionPane.showInputDialog(xName + ", what is your score?");
		double score = Double.parseDouble(scoreStr);
		
		JOptionPane.showMessageDialog(null, xName + "! Your grade is " +getGrade(score));
	
	}
	
	public static char getGrade(double x){
		char g = ' ';
		System.out.println("x====> "+x);
		if (x >=90)
			g='A';
		else if (x >=80)
			g = 'B';
		else if (x >=70)
			g = 'C';
		else if (x >=60)
			g = 'D';
		else
			g = 'F';
		return g;
		
	}
	
}
