import java.applet.Applet;
import java.awt.*;

public class Program44 extends Applet {
    Label lb1 = new Label("FlowLayout");
    FlowLayout fl = new FlowLayout();
    Button btn1 = new Button( "RIGHT");

    public void init() {
        add(lb1);
        setLayout(fl);
        add(btn1,FlowLayout.RIGHT);
  

    }

}

/*
 * <applet code="Program44.class" width="500" height="500">
 * </applet>
 */