import java.applet.Applet;
import java.awt.*;

public class Program46 extends Applet {
    GridLayout gl = new GridLayout(2, 2);
    Button btn1 = new Button("1 ");
    Button btn2 = new Button("2");
    Button btn3 = new Button("3");
    Button btn4 = new Button("4");

    public void init() {

        setLayout(gl);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);

    }

}

/*
 * <applet code="Program46.class" width="500" height="500">
 * </applet>
 */