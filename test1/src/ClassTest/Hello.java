package ClassTest;

import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class Hello {

	public static void main(String [] args){
		
		doCompute();
		System.exit(0);
	}
	
	public static void doCompute() {
//		final double PI = 3.14159;
//		double radius = 5.0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius, pls: ");
		double radius = input.nextDouble();
		double area = Math.pow(radius, 2.0)* Math.PI;
		
		
		System.out.println("Area is " + area);
	}
}
