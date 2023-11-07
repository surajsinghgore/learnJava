class Box{
    float height;
    float dept;
    float width;
    void setBox(float h,float d,float w){
        height=h;
        dept=d;
        width=w;
    }
    void showBox(){
        float area=2*(height*dept+dept*width+width*height);
        System.out.println("Area of Box is "+area);
    }
}

public class Program11 {
 public static void main(String[] args) {
    Box obj1=new Box();
    Box obj2=new Box();
    obj1.setBox(2, 4, 6);
    obj1.showBox();
    obj2.setBox(4, 9, 6);
    obj2.showBox();
 }   
}
