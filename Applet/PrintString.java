import java.applet.Applet;
import java.awt.Graphics;

public class PrintString extends Applet {

    public void paint(Graphics g) {
        g.drawString("Hello World", 100, 200);
    }
}

/* <applet code="PrintString.class" height="400" width="500"></applet> */