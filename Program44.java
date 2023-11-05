import java.applet.Applet;
import java.awt.*;

public class Program44 extends Applet {
    Label lb = new Label("FlowLayout");
    FlowLayout fl = new FlowLayout(FlowLayout.RIGHT);
    Button btn = new Button( "RIGHT");

    public void init() {
        add(lb);
        setLayout(fl);
        add(btn);
  

    }

}

/*
 * <applet code="Program44.class" width="500" height="500">
 * </applet>
 */