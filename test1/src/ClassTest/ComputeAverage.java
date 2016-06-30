package ClassTest;

import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class ComputeAverage {
	
	public static void main (String[] args){
		
		System.out.print("Enter 3 numbers");
		Scanner input = new Scanner(System.in);
		
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		
		System.out.printf("Average is %6.2f\n", getAverage(n1, n2, n3));
		
	}
	
	public static double getAverage(double a, double b, double c){

		return (a+b+c)/3;
	}

}
