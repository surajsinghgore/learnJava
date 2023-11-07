class MyClass {

    void display() {
        System.out.println("From Super Class");
    }
}
class SubClass extends MyClass{

    void display(){
        System.out.println("From Sub Class");
    }
}
public class Prrogram22 {
    public static void main(String[] args) {
System.out.println("Method Overriding");
MyClass obj1=new MyClass();
SubClass obj2=new SubClass();
obj1.display();
obj2.display();
    }
}
