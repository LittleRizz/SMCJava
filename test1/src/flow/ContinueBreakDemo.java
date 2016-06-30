package flow;

public class ContinueBreakDemo  {

       public static void main(String[] strAr) {
			   
                int i=0; 
                while (i != 10){
                	System.out.println(i);	
                	i++;
//                	if (i == 4){
//                		System.out.println("i is 4");
//                		continue;
//                	}
                	
                	if (i == 5){
                		System.out.println("i is 5");
                		break;
                	}
                	System.out.println("inside while loop");	
                	
                }
                System.out.println("outside while loop");	   
        }
     
}





