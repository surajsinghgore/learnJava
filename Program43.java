import java.applet.Applet;
import java.awt.*;

public class Program43 extends Applet{
    TextField text1;
// input:text
Label lb1=new Label("FullName");
TextField tf=new TextField(60);



// checkbox
Label lb3=new Label("Hobbies");
Checkbox hb1=new Checkbox("Study");
Checkbox hb2=new Checkbox("Play");
Checkbox hb3=new Checkbox("Read");
Checkbox hb4=new Checkbox("Draw");
 

// textarea
Label lb2=new Label("Message");
TextArea ta=new TextArea();
// radio
Label lb4=new Label("Gender");
CheckboxGroup cbox=new CheckboxGroup();
Checkbox c1=new Checkbox("Male",cbox,true);
Checkbox c2=new Checkbox("Female",cbox,false);
Checkbox c3=new Checkbox("other",cbox,false);

// choice
Label lb5=new Label("Country");
Choice country=new Choice();


// list
Label lb6=new Label("Favorite Programming Language");
List FavProg=new List(4,true);

Button btn=new Button("Submit");
public void init(){
    // input
add(lb1);
add(tf);

add(lb2);
add(ta);


add(lb3);
add(hb1);
add(hb2);
add(hb3);
add(hb4);


add(lb4);
add(c1);
add(c2);
add(c3);

// choice
System.out.println("\n");
add(lb5);
country.add("India");
country.add("Australia");
country.add("Sri Lanka");
country.add("USA");
country.add("UK");
country.add("Israel");
add(country);

// list
FavProg.add("Java");
FavProg.add("Javascript");
FavProg.add("C");
FavProg.add("C++");
FavProg.add("C#");
FavProg.select(0);

// list
add(lb6);
add(FavProg);

// btn
add(btn);
    }

    public void paint(Graphics  g){
     g.setColor(Color.red);
     g.drawString("AWT CONTROLS", 150, 450); 
     
     

    }
}

/*
 * <applet code="Program43.class" width="500" height="500">
 * </applet>
 */