import java.awt.*;
import javax.swing.*;
 
public class Program40 extends JApplet {
 
    public void init()
    {
        // set size
        setSize(400, 400);
 
        repaint();
    }
 
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