import java.applet.Applet;
import java.awt.*;

public class Program44 extends Applet {
    Label lb1 = new Label("FlowLayout");
    FlowLayout fl = new FlowLayout(FlowLayout.RIGHT);
    Button btn1 = new Button("FlowLayout RIGHT");

    public void init() {
        add(lb1);
        setLayout(fl);
        add(btn1);

    }

}

/*
 * <applet code="Program44.class" width="500" height="500">
 * </applet>
 */