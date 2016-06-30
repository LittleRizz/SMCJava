package inheritance;

import java.awt.Color;
import java.applet.*;

public class SuperClassGetter {
	
	public static void main(String[] args) {
	  
    //BetterRectangle br = new BetterRectangle(23,45,67,89,Color.RED);
	  Applet a = new Applet();
    
    getMySuperClasses(a);
  }

  static void getMySuperClasses(Object o) {
	  
  
    Class subClass = o.getClass();
    
    
    Class superClass = subClass.getSuperclass();
    
    while (superClass != null) {
     
      System.out.println(superClass.getName());
      
      subClass = superClass;
      
      superClass = subClass.getSuperclass();
    }
  }
}