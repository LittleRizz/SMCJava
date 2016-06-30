//An Applet (Displays Numbers with special text for particular numbers)
package flowSolutions;
import java.applet.*;
import java.awt.*;

public class DisplayBoth extends Applet {
        StringBuffer strBuf = new StringBuffer() ;

        public void init() {
                this.setBackground(Color.PINK);

                for(int i = 1; i <= 14; i++) {
                        if (((i % 3) == 0) && ((i % 4) == 0)) {
                                strBuf.append(" " + "both");
                        }
                        else if ((i % 3) == 0) {
                                strBuf.append(" " + "bo");
                        }
                        else if ((i % 4) == 0)  {
                                strBuf.append(" " + "th");
                        }
                        else {
                                strBuf.append(" " + i);
                        }
                }
        }

        public void paint(Graphics g)  {
                g.drawString(strBuf.toString(),10,50);
        }
}


