import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program47 extends Applet implements ActionListener {
    Label lb1 = new Label("Num 1: ");
    Label lb2 = new Label("Num 2 : ");
    Label plus = new Label("+");
    Button calc = new Button("Calculate");
    TextField tf1 = new TextField(20);
    TextField tf2 = new TextField(20);
    int sum = 0, num1, num2;

    public void init() {

        add(lb1);
        add(tf1);
        add(plus);
        add(lb2);
        add(tf2);
        add(calc);
        calc.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        num1 = Integer.parseInt(tf1.getText());
        num2 = Integer.parseInt(tf2.getText());
        sum = num1 + num2;
        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);

        g.drawString("Sum = " + sum, 240, 100);
    }
}
/*
 * 
 * <applet code="Program47.class" width="500" height="500"></applet>
 * 
 */