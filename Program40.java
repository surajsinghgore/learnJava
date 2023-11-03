import java.awt.*;
import java.applet.*;
 
public class Program40 extends Applet {
 
    
    // paint the applet
    public void paint(Graphics g)
    {
        // set Color for rectangle
        g.setColor(Color.red);
 
        // draw a rectangle
        g.drawRect(100, 100, 200, 200);
    }
}
/* 
<applet code="Program40.class" width="400" height="400"> 
</applet> 
*/  