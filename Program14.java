class Student{

    int id;String name;
Student(int i,String n){
id=i;
name=n;
}
Student(Student obj){
    id=obj.id;
    name=obj.name;
}
void display(){
    System.out.println("Id = "+id+" Name = "+name);
}
}

public class Program14 {
    public static void main(String[] args) {
        Student obj1=new Student(11,"suraj");
        Student obj2=new Student(12,"shubham");
        System.out.println("Copy Constructor");
        obj1.display();
        obj2.display();
        Student obj3=new Student(obj1);
obj3.id=obj1.id;
obj3.name=obj1.name;
obj3.display();
    }
}
