class MyClass{
    void display(){
        System.out.println("Message from MyClass");
    }
}
class MySub1 extends MyClass{
    void display(){
        System.out.println("Sub class1 Message");
    }
}
class MySub2 extends MyClass{
    void display(){
        System.out.println("Sub class2 Message");
    }
}

public class Program23 {
 public static void main(String[] args) {
    System.out.println("Dynamic Method Dispatch");
    MyClass obj1=new MyClass();
    MySub1 obj2=new MySub1();
    MySub2 obj3=new MySub2();
    MyClass obj;
    obj=obj1;obj.display();
    obj=obj2;obj.display();
    obj=obj3;obj.display();
 }   
}
