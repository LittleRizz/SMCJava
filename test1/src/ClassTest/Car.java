package ClassTest;

import java.awt.*;
import javax.swing.*;

public class Car {
	
	private String make, color;
	private double price, vinNumber;
	
	
	
	public void setMake(String m){
		this.make = m;
	}
	public String getMake(){
		return make;
	}
	
	public void setPrice(double p){
		if (p > 0){
		price = p;
		}
		else {
			System.out.println("Incorrect price");
		}
	}
	public double getPrice(){
		return price;
	}
	public void setColor(String c){
		this.color = c;
	}
	public String getColor(){
		return color;
	}
	public void setVin (double vin){
		this.vinNumber = vin;
	}
	public double getVin(){
		return vinNumber;
	}
	
}
