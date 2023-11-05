import java.applet.Applet;
import java.awt.*;

public class Program42 extends Applet {

    public void paint(Graphics g) {

        g.drawLine(180, 150, 180, 370);
        g.drawLine(180, 150, 440, 370);
        g.drawLine(180, 370, 440, 370);
    }

}
/*
 * <applet code="Program42.class" width="500" height="500">
 * </applet>
 */