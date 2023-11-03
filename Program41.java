
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Program41 extends Applet {

    public void paint(Graphics g) {

        // set color to red
        setForeground(Color.red);

        // draw filled oval
        g.fillOval(20, 20, 100, 100);

    }
}

/*
 * <applet code="Program41.class" width="400" height="400">
 * </applet>
 */