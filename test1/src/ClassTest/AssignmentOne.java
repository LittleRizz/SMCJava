package ClassTest;

import javax.swing.JOptionPane;

public class AssignmentOne {
	
	public static void main(String[] args){
		double startTime = System.nanoTime();
		String xName = JOptionPane.showInputDialog("What is your name?");
		DrewFinder(xName);
		String scoreStr = JOptionPane.showInputDialog(xName + ", what is your score?");
		double score = Double.parseDouble(scoreStr);
		
		JOptionPane.showMessageDialog(null, xName + "! Your grade is " +getGrade(score));
		double endTime = (System.nanoTime()-startTime)/1000;
		System.out.println("This took " + endTime + " millisecconds");
	
	}
	
	public static void DrewFinder (String x){
		String drewbert = "Drew";
		String email = "ender126@yahoo.com";
		int studentId = 1409604;
		if (x.equals(drewbert)){
				JOptionPane.showMessageDialog(null, x + "! Welcome!  Your Student ID is " + studentId + ", and your email is " +email);
				
			}
			else {
				System.out.println("This isn't Drew.");
			};
		
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
	