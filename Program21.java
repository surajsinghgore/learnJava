class Base{
    int num=90;
    void print(){
        System.out.println("Value of num in Base class is "+num);
    }
}

class ChildClass extends Base{
    int num=10;
    void print(){
              System.out.println("Value of num in child class is "+num);
              super.print();

    }
}
public class Program21 {
    public static void main(String[] args) {
        System.out.println("Super Keyword");
        ChildClass obj=new ChildClass();
        obj.print();
    }
}
