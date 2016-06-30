package ClassTest;

import java.awt.*;

public class TestCar{
	public static void main (String[] args){
		
		Car c1 = new Car();
		Car c2 = new Car();
		c1.setMake("Nissan");
		c1.setPrice(34000.0);
		c1.setColor("Green");
		c1.setVin(43495743);
		System.out.println(c1.getPrice());
	}
}