import java.applet.Applet;
import java.awt.*;

public class Program45 extends Applet {
    BorderLayout bl = new BorderLayout();
    Button btn1 = new Button("NORTH ");
    Button btn2 = new Button("EAST");
    Button btn3 = new Button("SOUTH");
    Button btn4 = new Button("WEST");

    public void init() {
       
        setLayout(bl);
        add(btn1,BorderLayout.NORTH);
        add(btn2,BorderLayout.EAST);
        add(btn3,BorderLayout.SOUTH);
        add(btn4,BorderLayout.WEST);

    }

}

/*
 * <applet code="Program45.class" width="500" height="500">
 * </applet>
 */