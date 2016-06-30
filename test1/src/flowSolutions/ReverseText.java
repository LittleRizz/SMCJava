//A ReverseText class - an Applet, and a ManipulateString class

package flowSolutions;

import java.applet.*;
import java.awt.*;

public class ReverseText extends Applet {
        String returnedStr;

        public void init() {
                this.setBackground(Color.MAGENTA);
                returnedStr      = StringManipulator.reverseString("reverse me**");
                System.out.println(returnedStr);
        }


        public void paint(Graphics g)  {
                g.drawString("reverse me**  -  " + returnedStr,10,50);
        }
}


class StringManipulator {
        public static String reverseString(String strToRvrs) {
                int len = strToRvrs.length();
                
                //declaration, assignment, instantiation and initalization all in the next line!
                
                StringBuilder strForManip = new  StringBuilder(len);

                for (int i = (len-1);  i >= 0; i--) {
                        strForManip.append(strToRvrs.charAt(i));
                 }
                 return strForManip.toString();
        }
}


