package ClassTest;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.text.*;

public class ErrorCatch {

	public static void main (String[] args){
		
		//System.out.println("args[o] is " + args[0]);
		//System.out.println("args[1] is " + args[1]);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Number>>>");
		double sum = input.nextDouble();
		System.out.println("You entered "+ sum);
		input.nextLine();
		System.out.println("Enter Name");
		String name = input.nextLine();
		
		if (name.equalsIgnoreCase("Lisa"))
			System.out.println("Hello Lisa");
		else
			System.out.println("NOOOOO>>>>> " +name);
		
		String n1 = "Jack";
		String n2 = "Lisa";
		
		System.out.println(n1 +" compareTo "+n2);
		
		if (n1.compareTo(n2) > 0)
			System.out.println("n1 > n2");
		else if (n1.compareTo(n2) < 0)
			System.out.println("n1 < n2");
		else
			System.out.println("n1 == n2");
	}

	
}
