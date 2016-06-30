package ClassTest;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;
import java.text.*;

public class MathRandom {

	public static void main (String[] args){
		
		String x = "Hello from Jupiter";
		String out = x.toUpperCase()+"\n";
		out+= x.toLowerCase();
		System.out.println(out);
		String r = "";
		
		for (int i=0; i< x.length(); i++){
			char ch = x.charAt(i);
			if (isUpper(ch)){
				
				
			}
			else{
				
			}
		}
		
	}
	
	public static boolean isUpper(char x){
	/*	if (x >= 'A' && x <='Z')
			return true;
		return false;
	}
	*/
	return x>='A' && x <='Z';
	}
}
